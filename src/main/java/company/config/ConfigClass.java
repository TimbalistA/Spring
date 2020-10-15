package company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import company.model.Address;

@Configuration
@ComponentScan(value = "company.model")
public class ConfigClass {

    @Bean
    public Address getAddress() {
        return new Address("New York", "Fifth Avenue", 650);
    }

}
