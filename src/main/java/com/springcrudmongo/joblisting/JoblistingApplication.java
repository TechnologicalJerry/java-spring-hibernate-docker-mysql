package com.springcrudmongo.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoblistingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
				.build().apiInfo(apiInfo()).useDefaultResponseMessages(false);
	}

}
