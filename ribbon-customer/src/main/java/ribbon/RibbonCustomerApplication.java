package ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Cherie on 2021/02/04
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonCustomerApplication.class, args);
    }

}
