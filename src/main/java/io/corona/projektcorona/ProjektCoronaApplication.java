package io.corona.projektcorona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjektCoronaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektCoronaApplication.class, args);
	}

}
