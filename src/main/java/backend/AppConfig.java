package backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	
	@Bean
	public EducationalMember student() {
		EducationalMember cs = new Student();

		cs.presentYourself();
		return cs;
	}
	
	@Bean
	public EducationalMember instructor() {
		EducationalMember cs = new Instructor();

		cs.presentYourself();
		return cs;
	}

}
