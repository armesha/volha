package com.volha.labdbmanger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class LabDBManagerApplication {//

	public static void main(String[] args) {
		SpringApplication.run(LabDBManagerApplication.class, args);
	}

}
