package vn.iotstar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.vnmandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class SpringBootiotstarlication implements vnmandLineRunner{
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBootiotstarlication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootiotstarlication.class, args);
		
		LOGGER.info("-- APPLICATION RUNNING --");
	}

	public void run(String... args) throws Exception {

		
	}

}
