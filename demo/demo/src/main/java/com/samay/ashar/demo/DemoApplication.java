package com.samay.ashar.demo;

import com.samay.ashar.demo.config.RabbitMQConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigurationProperties(RabbitMQConfigProperties.class)
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
