package com.vdit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vdit.service.ReportService;

@SpringBootApplication
public class SpringBootApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp1Application.class, args);
		ReportService reportService = context.getBean(ReportService.class);
		reportService.generateReport();

	}

}
