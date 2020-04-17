package com.oceano.dataNomixBatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataNomixBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataNomixBatchApplication.class, args);
	}

}
