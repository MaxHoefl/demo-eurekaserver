package spring.cloud.demo.demoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages={"spring.cloud.demo.demoeurekaserver"})
public class DemoEurekaServerApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaServerApplication.class, args);
	}
}
