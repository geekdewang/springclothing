package com.zdwsh.springclothing.test;

import com.zdwsh.springclothing.util.EncryptionUtil;

public class Test {
    public static void main(String[] args) {

        //jBFTovUySAZ+0WR7iZr+Qw==
        String key = EncryptionUtil.createAESKEY();
        System.out.println("AES秘钥生成" + key);
        String res = "admin2222";
        String pw = EncryptionUtil.AESEnc(EncryptionUtil.SECRET_KEY,res);
        //AES加密xjTb7SIPbvSDjHC0Cv3HNA==
        System.out.println("AES加密" + pw);
        System.out.println("AES解密" + EncryptionUtil.AESDec(EncryptionUtil.SECRET_KEY,pw));
    }
}
