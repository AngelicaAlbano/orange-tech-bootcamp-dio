package dio.bootcamp.designpatternpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesignPatternPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternPracticeApplication.class, args);
	}

}
