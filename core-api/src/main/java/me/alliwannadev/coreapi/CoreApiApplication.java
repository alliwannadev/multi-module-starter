package me.alliwannadev.coreapi;

import me.alliwannadev.coredomain.CoreDomainConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(CoreDomainConfiguration.class)
@SpringBootApplication
public class CoreApiApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-core-domain,application-core-api");
        SpringApplication.run(CoreApiApplication.class, args);
    }

}
