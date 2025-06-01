package com.harishdeshpande.AliceBakery;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakery implements CommandLineRunner {

	@Autowired
	private CakeBaker baker;

	public static void main(String[] args) {
		SpringApplication.run(AliceBakery.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(baker.bakeCake());
	}

	@PostConstruct
	void callThisBeforeCakeIsBaked() {
		System.out.println("Got the cake order");
	}

	@PreDestroy
	void callThisBeforeDestroy(){
		System.out.println("Cake is ready");
	}

}
