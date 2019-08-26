package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101000651964";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCRQ1CRZZULC9twH7L6afh8K30/QyNv49BA9qfNH+DXqjw/rkSM8582KkjTxODXFlGf81VWxiECcuXVX5Wv0Bdj6n1diy7ecO++n5+kq4nIYRGop5u5ZJtW0n39SKiCUFL16Co8v9hPTO6I2jorxx7chIzkAQO1Wtl9ULvs8KgbkMOmdIapAyN8XWSVDoNN0dN3i8F6PPJ+zyadaHqnTvAYoTJJwCyrbNRv3DQo/cZ9V9cQMHa24yz+1WIyn7/Tg5kFtnHuCfsLW2XYeJZ9H6BRMI81py0/M6Z+ArNccbDxcop1m9MPnSW/f+tNtS6Rc7F3lKWW5V2Myti8DUKeoa0DAgMBAAECggEARNlY2HEDIUcvbIc5t0J+yat7I37YzvF1BTVi9vADC3TeNXiNeRkG/w8vkV+hCZDEg0E703L4tkZq9KTnN3szeuHrJWkQf9GbcAgMDGpZVaXcTsmSH1612YLOwDut0oXrrC2rxztOdNeLv0VfiNxJnk8cz/xDG7PBnYmkaHrv0pAiTl2frhV1YJglWvWE6PvMSqmvzgWSNFSKku4z8UIUZviUAI/aA74jkosyPGER3AUhzcHuoyHflCoHrYTfY5mKYiOlm2qYFL44iATuP9qmKiweOG1w+iq5AVJCfPMpExRTqvXGmyjj44gTOzvcILPUMzGGwkDK8z74F9yPGzJDQQKBgQDqCk6kKBnYqHLFBPJblwnztR9O0Yy2HORtNFHadZOJ938LyRvadzuRUwUCyrCFTXKvYlH/G4tEqiSAXKpEeBjms3ojZ7+WSI5M24MDqCc10C6Mz4rqehN3nf3EFOwl1RUqZaL33BThWl7wBKrdd6JSRnK0okWDWoYOPNQpZwCT8QKBgQCe5I8hICEXnTqy6+n7QTeNr53T3NA2GmxbXKdXOk2XRgf3lP/yPgPfiEFJ3agKu/X8WqXPs1ayyw9MjS5kB48sh7CySdQlxIu/cxk5dChIcWVd3ARqIpI8p5ZEr2bE5hczRFw0L6mz7uEBD2PCe+BlpRgJBdYniPiHYx0mzSt0MwKBgAWWu2wGHR/kXeFAjf0L7UvpjlbWgDK1G+tTrYS2/A/2Xg1M/yJHaJ++yMbZSj/UqqFvip+566h3G6oJDHPYHlgb/xWrW5LeJq/FKirDMDSDxSjNp/aTdbWMi0vMaBs7LGc3yB19Hu6Gtu+qXN4vBixKzGBt45UQa1UZtMNMV2IxAoGAK7X6vgUltWZWmJQX2Tv2uW6ff4IWcVvRhUy26GMspznnxS9jPdPbounL9DMbIGDW6eZSCRJv/l2oRsnsAi6mL3zgmht/Vih8vV0/ijOvRUaUuT5mpIAANNlxmFGcdvxJU5wxtVWLXOmRUoZWTlFfyPai5xCI+nVO0YftpBf7JUsCgYB3q66IO5EehHKOOtPNg8AkexiXf2+Uz1bq66B6VqHxEpsla8Umz/iAfpURGfLv00rWZB4bY1liManMjfa0B7DASOCcx3ua3BCvWHPl80DNXWXdQUv7a50cODJTEBbPhH4AwgpbR8l7BchxwbOrOLnSO7W/2KC6/2ber6EEPpabwA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkUNQkWWVCwvbcB+y+mn4fCt9P0Mjb+PQQPanzR/g16o8P65EjPOfNipI08Tg1xZRn/NVVsYhAnLl1V+Vr9AXY+p9XYsu3nDvvp+fpKuJyGERqKebuWSbVtJ9/UioglBS9egqPL/YT0zuiNo6K8ce3ISM5AEDtVrZfVC77PCoG5DDpnSGqQMjfF1klQ6DTdHTd4vBejzyfs8mnWh6p07wGKEyScAsq2zUb9w0KP3GfVfXEDB2tuMs/tViMp+/04OZBbZx7gn7C1tl2HiWfR+gUTCPNactPzOmfgKzXHGw8XKKdZvTD50lv3/rTbUukXOxd5SlluVdjMrYvA1CnqGtAwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
 	public static String notify_url = "http://localhost:8080/BigMenShoppingMall/Succeed.action";

 	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
 	public static String return_url = "http://localhost:8080/BigMenShoppingMall/OrderList_Add";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
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

