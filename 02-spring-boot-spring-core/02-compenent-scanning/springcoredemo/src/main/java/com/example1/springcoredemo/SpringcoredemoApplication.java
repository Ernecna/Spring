package com.example1.springcoredemo;

import org.springframework.boot.SpringApplication;
//Enables auto config compenent scanning additional configuration
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(
		scanBasePackages = {"com.example1.springcoredemo","util"}
)
*/

@SpringBootApplication
public class SpringcoredemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
