package Chinthakayala.Spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args)

		{
			var Context=new AnnotationConfigApplicationContext(Senior.class);
			System.out.println(Context.getBean("name"));
			System.out.println(Context.getBean("age"));
			System.out.println(Context.getBean(Person.class));
			//System.out.println(Context.getBean("person2methodcall"));
			//System.out.println(Context.getBean("addres"));
			System.out.println(Context.getBean(Address.class));
			//Arrays.stream(Context.getBeanDefinitionNames()).forEach(System.out::println);

		}
	}


