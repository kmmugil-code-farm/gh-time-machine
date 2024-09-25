package com.enterprise.gtm;

import org.springframework.boot.SpringApplication;

public class TestOctocatTimeMachineApplication {

	public static void main(String[] args) {
		SpringApplication.from(OctocatTimeMachineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
