package cloud.makeronbean.chos1npm.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author makeronbean
 * @createTime 2022-11-05  11:45
 * @description TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "cloud.makeronbean.chos1npm")
public class ServiceSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceSystemApplication.class, args);
    }
}
