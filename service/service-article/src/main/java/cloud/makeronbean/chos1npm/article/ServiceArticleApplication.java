package cloud.makeronbean.chos1npm.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author makeronbean
 * @createTime 2022-11-05  12:41
 * @description TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "cloud.makeronbean.chos1npm")
public class ServiceArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceArticleApplication.class, args);
    }
}
