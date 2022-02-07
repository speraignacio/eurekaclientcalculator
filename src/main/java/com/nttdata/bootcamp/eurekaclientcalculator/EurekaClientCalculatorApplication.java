package com.nttdata.bootcamp.eurekaclientcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCalculatorApplication.class, args);
	}

}
