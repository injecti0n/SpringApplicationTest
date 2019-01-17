package SpringApplication.App;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import backend.EducationalMember;
import backend.Instructor;
import backend.Student;

public class SpringApplication {

	public static void main(String[] args) {

		/*
		 * / EducationalMember student = new Student("Jack", 1);
		 * 
		 * student.presentYourself();
		 * 
		 * EducationalMember instructor = new Instructor("Elon", 1);
		 * instructor.presentYourself();
		 */

		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(backend.AppConfig.class);

		EducationalMember student = ctx.getBean("student", Student.class);
		EducationalMember instructor = ctx.getBean("instructor", Instructor.class);

		student.presentYourself();
		instructor.presentYourself();
		ctx.close();

	}
}