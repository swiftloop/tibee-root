package com.framework.tibee;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
public class TibeeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TibeeServerApplication.class, args);
    }

}
