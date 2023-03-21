package net.DevOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleDevOpsProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleDevOpsProject2Application.class, args);
		System.out.println("New Pipeline");
	}

}
