package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *������AlipayConfig
 *���ܣ�����������
 *��ϸ�������ʻ��й���Ϣ������·��
 *�޸����ڣ�2017-04-05
 *˵����
 *���´���ֻ��Ϊ�˷����̻����Զ��ṩ���������룬�̻����Ը����Լ���վ����Ҫ�����ռ����ĵ���д,����һ��Ҫʹ�øô��롣
 *�ô������ѧϰ���о�֧�����ӿ�ʹ�ã�ֻ���ṩһ���ο���
 */

public class AlipayConfig {
	
//�����������������������������������Ļ�����Ϣ������������������������������

	// Ӧ��ID,����APPID���տ��˺ż�������APPID��Ӧ֧�����˺�
	public static String app_id = "2016092300581723";
	
	// �̻�˽Կ������PKCS8��ʽRSA2˽Կ
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCrN1IAzniUgrCRBz2z5VeH0/2IXd58aCGjKJGTTDPT6mK8/Js/UQGHkHT5JHjuxXm6wdD4HkmNpDwjAF30FrrMNOEdvSzwlYOBe9El2PU8XR3rp+wl30w1On+YBLKo60SDPZ5ktqPZz/NOq1yDLFO/pKvqkLu4xnJe5jIP0sE2hRR6X3gkcA7h+D6kPvop77arhiPT+fhKl8sskZajRDXNKlfuANWY3XU91B7a+sTToV2X4M7wc/WPHU8ujGbtQ4Wl8FIREpNEzuxiY4XSbkEgIkhs4mRJBNPcGXmfmof1A0L4MvEQeUH4Ozz92b8y27Hpya7IdTCZZvLXFrcD+1X7AgMBAAECggEACoqeZuRPcj1Vp6g9eUz+haNcsb+tyhUTNRtzUxFXA44jxCT9Xfmb0X/oY8qGE5Ve+EuklRIwTyM0fKcyIawgliAPWChkku9xqFA6QU1JVA0boX22QWKtK33Ni0uGwHWzwyzRCrxf/DIcddSBHqZlBaCa4RdGJ4s4UXV00ZqVQMj4vVxoyoVqWNw2n78ZpqLJhOO6ErL4ee50p7Ge2dijKUQRiNY2mKX2DaJAYllhYuI7P4MAdnpOlqjeqp1rEySRRHNG8ciXdTrTRFtYUPgICeVGr4wNfzqxGP36kElUP+MYK43aRETMUiwFY/CaJTtmnk10HflMZwkrK8ASmzzpoQKBgQDxku1hh78ZWKKaWdq5PSVVFyLfxGi8X5SoKeoTsixOuECcHhzlM/lUgv98yoN+NUJpkqRDTtQToTfkDwr1d9yS6V7MXwit73cYNw3r+u0+bnDMtjcaKo2v7eu4Gm0jLPzlw9MUoo6sanEpQgpTauo3jEkfFtQEbLCXNusoQTd+6wKBgQC1cMtYeOUuvwlp7IK+0PlSDmBpyJHbfPCS2qqmL//rh2qaUbbt3XblDcwRHj+WitqpjW/PfKaafhPGpKvH1bvwMprS1y7uq8zqngD8eokBDJb9Z/NcLtJ67u9q9vDVUZ1sMyrlXg0Pj2rPiGud6bmHdCW+vipRA9FPEZgW1I9hMQKBgQChdQwHNY05yY3UD94qFH4RIweB+2ntDQz0YB88zsbiTi+QqGezoUsxeuR7aXb9MWeT3BjBi7we6o/Kc2tlqJjZ7/QWMCZC6lv06Ub6w5kxMutdRyQI7wwH28LCJ5dt/TGB96HqlsM45WOAqczw9/JW8gIlL0LBOkvEpUYCf6QxxQKBgDcYqlcSVx3r2vL0Y/uHv74AKZzV0BzjgrZFen5+ouslsuRrne37S0hg+S/VjJ+tSJsmHObXxkuxr1Wp2ZQUPj7BTyxpNZI6Tz6Lfmcs2n+cEBmhQFAk07uK5N8JX7aXUwNxQjxmY/buqROeLHfGapVMWs3iNz1kuGGXSSTdpTBxAoGAWXLXisiRVrJgiVdJG8jDOZlSUo1MoWRD624A92q+AGmpSU6ZTazJv75qVAvx/fa09uWOEVuOimHQhn3dt+B87nkCL7cRvfKktF144+cEOr5YKWiIpuGOePTyhyav3kMXsTT826ROmxp9CnMbehjWyDYNgkA9KXQDpY45s7lFILU=";
	
	// ֧������Կ,�鿴��ַ��https://openhome.alipay.com/platform/keyManage.htm ��ӦAPPID�µ�֧������Կ��
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnRsVeOH6elsB4YhQ9llFxkXknTIILKV+MWMpNuIITbhVM2erzfV+5V3YCi13uZma9PSTtUwqryFYMrwVKhZ2HwDKzvn/IfPrjIWPfeLpcArORnu84ZRc4AAJEJPH74fCWb/kRGcii3iLE7czgzXIzV7zKiYE4HqdeZCtGLfbHchrmcbsZ56KGX+e+BhM4TVab06YlnBD8k+w7uRAse5rxwGeMDoHPRqdvQIk/fTqSPw++Ayt7ELUrqu7TxhAjxAswRPaBbzIVNGzQvhj1Gh1rCoaLqdUG4b9aWw/INq/W3Wzb1lqE+anLyatUQsqvS4DWBXj3WslyC/2gT0ABmWMhQIDAQAB";

	// �������첽֪ͨҳ��·��  ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String notify_url = "http://localhost:8080/notify_url.jsp";

	// ҳ����תͬ��֪ͨҳ��·�� ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String return_url = "http://localhost:8080/return_url.jsp";

	// ǩ����ʽ
	public static String sign_type = "RSA2";
	
	// �ַ������ʽ
	public static String charset = "utf-8";
	
	// ֧��������
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // "https://openapi.alipay.com/gateway.do";
	
	// ֧��������
	public static String log_path = "C:\\";


//�����������������������������������Ļ�����Ϣ������������������������������

    /** 
     * д��־��������ԣ�����վ����Ҳ���ԸĳɰѼ�¼�������ݿ⣩
     * @param sWord Ҫд����־����ı�����
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

