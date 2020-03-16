package demo.todo;

import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.spec.AlgorithmParameterSpec;

public class WechatPhoneNumber {

//    openid -> onjiv4soBBONlgqVv-0zAR5ACm8I
//    session_key -> 72otUK7jZQBCCfCMNCo8Hw==

    public static void main(String[] args) throws Exception {
        String AES = "AES";
        String AES_CBC_PKCS7 = "AES/CBC/PKCS5Padding";

        String encryptedData = "9zpA0lr9ctDVlSAhnLEkPnr1O0f9j3CyuJMi55Cmq0Ipib6K5OpsQUA" +
                "/9ja30Gq0HWU0OrO1cUNFJAGLg3miwKGX61ACTV6C4O98kJ5Pb/0H5/Azn/rCJ7w1ye8hI5BtueZcTk3RsQSIVG2KkyhL1jhfyTLDEQFTqs/hV7C5NN1APYzzI+UI+p34KZXuim6YAvMNDzainoZx4NuWX6NZgA==";
        String iv = "s0VLezf/6+UIXwp2ueePYg==";
        String sessionKey = "72otUK7jZQBCCfCMNCo8Hw==";

        BASE64Decoder decoder = new BASE64Decoder();
        byte[] data = decoder.decodeBuffer(encryptedData);
        byte[] aseKey = decoder.decodeBuffer(sessionKey);
        byte[] ivData = decoder.decodeBuffer(iv);

        AlgorithmParameterSpec ivSpec = new IvParameterSpec(ivData);
        SecretKeySpec keySpec = new SecretKeySpec(aseKey, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        String str = new String(cipher.doFinal(data), StandardCharsets.UTF_8);


        System.out.println(str);
    }

}
