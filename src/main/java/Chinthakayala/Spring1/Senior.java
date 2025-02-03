package Chinthakayala.Spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name, int age,Address address) { };
record  Address (int id, String street, String city) { };
    @Configuration
    public class Senior {
        @Bean
        public String name() {
            return "Ashok";
        }
        @Bean
        public int age() {
            return 18;
        }

        @Bean
        public Person person() {
            return new Person("Vamshi",25, new Address(6,"Cpi office","Khammam"));
        }
        @Bean
        public Person person2methodcall() {
            return new Person(name(),age(),addres());
        }
        @Bean (name="address2")
        public Address addres() {
            return new Address(6,"Cpi office","Khammam");
        }
    }

