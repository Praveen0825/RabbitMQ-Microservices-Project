package com.praveenRbtMq.orderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {
//docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4.0.1
	//docker run -it --rm -p 15672:15672 -p 5672:5672 rabbitmq:4.0.1-management
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
