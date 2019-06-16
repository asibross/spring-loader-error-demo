package com.example.demo;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
		SpringApplication.run(DemoApplication.class, args);
	}

}
