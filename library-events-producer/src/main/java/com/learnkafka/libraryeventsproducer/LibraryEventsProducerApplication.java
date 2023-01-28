package com.learnkafka.libraryeventsproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.learnkafka")
public class LibraryEventsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryEventsProducerApplication.class, args);
	}

}
