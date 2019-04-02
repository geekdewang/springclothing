package com.zdwsh.springclothing.util;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * 实现密码加密
 */
public class EncryptionUtil {

    public static final String SHA1="SHA-1";
    public static final String SHA256="SHA-256";
    public static final String SHA512="SHA-512";
    public static final String AES="AES";
    public static final String RSA="RSA";
    public static final String PUBLICKEY="pubkey";
    public static final String PRIVATEKEY="prikey";
    public static final String SECRET_KEY="n7+RZfqRAkozmOIGC4iN6w==";


    //对称加密
    //生成对称加密的秘钥 AES加密解密
    public static String createAESKEY() {
        try {
            //创建秘钥生成对象
            KeyGenerator aes = KeyGenerator.getInstance("AES");
            SecretKey secretKey = aes.generateKey();
            return Base64Util.base64Enc(secretKey.getEncoded());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //AES加密
    public static String AESEnc(String key, String msg) {
        //将字符串的秘钥转换为秘钥对象
        SecretKeySpec keySpec = new SecretKeySpec(Base64Util.base64Dec(key),"AES");

        try {
            //创建加密器
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE,keySpec);
            return Base64Util.base64Enc(cipher.doFinal(msg.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //AES解密
    public static String AESDec(String key,String msg) {
        SecretKeySpec keySpec = new SecretKeySpec(Base64Util.base64Dec(key),"AES");
        try {
            //创建加密器
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE,keySpec);
            return new String(cipher.doFinal(Base64Util.base64Dec(msg)));
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

}
