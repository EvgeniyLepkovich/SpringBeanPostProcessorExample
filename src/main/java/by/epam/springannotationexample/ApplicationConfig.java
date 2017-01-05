package by.epam.springannotationexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("by.epam")
public class ApplicationConfig {

    @Bean
    public static RandomIntBeanPostProcessor randomIntBeanPostProcessor(){
        return new RandomIntBeanPostProcessor();
    }

    @Bean
    public MomQuoter momQuoter(){
        return new MomQuoter();
    }
}
