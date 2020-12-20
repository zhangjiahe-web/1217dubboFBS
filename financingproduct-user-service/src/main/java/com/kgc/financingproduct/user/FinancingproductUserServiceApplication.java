package com.kgc.financingproduct.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.financingproduct.user.mapper")
@SpringBootApplication
public class FinancingproductUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancingproductUserServiceApplication.class, args);
	}

}
