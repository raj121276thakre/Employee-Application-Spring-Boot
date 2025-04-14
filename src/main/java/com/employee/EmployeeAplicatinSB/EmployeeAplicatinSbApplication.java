package com.employee.EmployeeAplicatinSB;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeAplicatinSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAplicatinSbApplication.class, args);
		System.err.println("\n.......Welcome to Employee Management Spring boot application.........\n");
	}

}
