package Chinthakayala.Spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Senior {
    @Bean
    public String run()
    {
        return " Succesfully Done";
    }

}
