package com.example.PojoScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CardConfig {
	@Bean
	public String item1() {
		return "Battary";
	}
	@Bean
	public String item2() {
		return "dvd";
	}
	@Bean
	public String item3() {
		return "Books";
	}
}
