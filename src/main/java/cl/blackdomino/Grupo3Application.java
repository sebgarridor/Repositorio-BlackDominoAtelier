package cl.blackdomino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Grupo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Grupo3Application.class, args);
	}

}
