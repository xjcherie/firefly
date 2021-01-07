package util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Cherie on 2020/11/05
 **/
public class TencentLocationUtils {

    public static void main(String[] args) {
        String KEY = "MKXBZ-WNL3W-MFPRL-R435G-YLTAE-ZHF4Z";
        String url = "https://apis.map.qq.com/ws/place/v1/search"
                + "?key=" + KEY
                + "&boundary=region(北京市,0)"
                + "&keyword=格林豪泰快捷酒店(北京回龙观"
                + "&orderby=_distance"
                + "&filter=category=酒店,客栈";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        String body = entity.getBody();
        System.out.println(body);
    }

}
