package com.finance.financebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.finance.financebackend")
public class FinancebackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancebackendApplication.class, args);
	}

}
