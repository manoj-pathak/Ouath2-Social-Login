package com.manoj;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso // comment if you want to enable login page
public class Ouath2SocialLoginApplication {

	@GetMapping("/")
	public String user(Principal principal) {
		return "Welcome " + principal.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ouath2SocialLoginApplication.class, args);
	}

}
