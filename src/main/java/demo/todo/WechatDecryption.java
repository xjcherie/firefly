package demo.todo;

import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.spec.AlgorithmParameterSpec;

public class WechatDecryption {

    public static void main(String[] args) throws Exception {
        String AES = "AES";
        String AES_CBC_PKCS7 = "AES/CBC/PKCS5Padding";

        String encryptedData = "";
        String iv = "";
        String sessionKey = "";

        BASE64Decoder decoder = new BASE64Decoder();
        byte[] data = decoder.decodeBuffer(encryptedData);
        byte[] aseKey = decoder.decodeBuffer(sessionKey);
        byte[] ivData = decoder.decodeBuffer(iv);

        AlgorithmParameterSpec ivSpec = new IvParameterSpec(ivData);
        SecretKeySpec keySpec = new SecretKeySpec(aseKey, AES);
        Cipher cipher = Cipher.getInstance(AES_CBC_PKCS7);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        String str = new String(cipher.doFinal(data), StandardCharsets.UTF_8);


        System.out.println(str);
    }

}
