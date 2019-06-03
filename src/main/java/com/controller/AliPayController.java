package com.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AliPayController {

    @RequestMapping(value = "/go", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String goAlipay() throws Exception {
        //��ó�ʼ����AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //�����������
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        //�̻������ţ��̻���վ����ϵͳ��Ψһ�����ţ�����
        String out_trade_no = "����11";
        //���������
        String total_amount = "20";
        //�������ƣ�����
        String subject = "����22";
        //��Ʒ�������ɿ�
        String body = "����:5";
        // �ñʶ��������������ʱ�䣬���ڽ��رս��ס�ȡֵ��Χ��1m��15d��m-���ӣ�h-Сʱ��d-�죬1c-���죨1c-���������£����۽��׺�ʱ����������0��رգ����ò�����ֵ������С���㣬 �� 1.5h����ת��Ϊ 90m��
        String timeout_express = "1c";
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"timeout_express\":\"" + timeout_express + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //����
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        return result;
    }

}

