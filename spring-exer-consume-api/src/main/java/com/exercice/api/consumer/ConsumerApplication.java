package com.exercice.api.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


import com.exercice.api.consumer.entity.ZipCode;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception
	{
		return args -> {
			ZipCode zip = restTemplate.getForObject(
					"https://www.zipcodeapi.com/rest/ffPdijGOManDoWUy7Nw49SERD0wOCFs1Lq1HFPgvqSIQG5S0CM7l39cRZ1CUT2Q0/info.json/90210/degrees",
					ZipCode.class);
			log.info(zip.toString());
			
		};
	}
	
	private static final Logger log = LoggerFactory.getLogger(ConsumerApplication.class);

}
