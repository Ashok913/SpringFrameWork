package Chinthakayala.Spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
		{
			var Context=new AnnotationConfigApplicationContext(Senior.class);
			System.out.println(Context.getBean("run"));
		}
	}

}
