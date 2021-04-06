package com.springboot.usercenter.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.springboot.usercenter.domain.User;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Cherie on 2021/02/01
 **/
@Slf4j
@Component
public class UserScheduler {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHHmm");
    private RestTemplate restTemplate = new RestTemplate();


//    private static final String USER_REGISTER_URL = "http://localhost:38080/ease-service/v1/user/users/register";

    private static final String USER_REGISTER_URL = "https://km.megaease.cn/ease-service/v1/user/users/register";

//    private RestTemplate restTemplate = new RestTemplate();

    @Scheduled(cron = "0 */10 * * * ?")
    public void createRemoteUser() {
        User user = new User();
        user.setUserName(dateFormat.format(new Date()));
        user.setPassword("123456");
        user.setMerchantId(1);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        try {
//            ResponseEntity<Resource> reponse = restTemplate.exchange(url, HttpMethod.GET, null, Resource.class);
            User result = restTemplate.exchange(USER_REGISTER_URL, HttpMethod.POST, new HttpEntity<>(user, headers), User.class).getBody();
            System.out.println(result);
        } catch (Exception e) {
            log.error("check token error", e);
        }
    }

    public static void main(String[] args) {
        SimpleDateFormat sp = new SimpleDateFormat("yyMMddHHmm");
        System.out.println(sp.format(new Date()));
    }

}
