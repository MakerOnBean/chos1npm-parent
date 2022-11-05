package cloud.makeronbean.chos1npm.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author makeronbean
 * @createTime 2022-11-05  20:23
 * @description TODO
 */
@SpringBootApplication
@EnableFeignClients("cloud.makeronbean.chos1npm")
@ComponentScan("cloud.makeronbean.chos1npm")
@EnableDiscoveryClient
public class ServiceCommentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCommentApplication.class, args);
    }
}
