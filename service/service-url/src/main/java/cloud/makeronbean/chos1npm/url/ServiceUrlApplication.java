package cloud.makeronbean.chos1npm.url;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author makeronbean
 * @createTime 2022-11-05  22:54
 * @description TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "cloud.makeronbean.chos1npm")
public class ServiceUrlApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUrlApplication.class, args);
    }
}
