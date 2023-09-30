package com.demo.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsApplication {
	@GetMapping("/jenkinstest")
	public String jenkinsTest(){
		return "Jenkins Deployment Working with continious Integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
