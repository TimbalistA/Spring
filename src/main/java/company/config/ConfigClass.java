package company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import company.model.Address;
import company.model.Company;
import company.model.Engineer;
import company.model.Grade;

@Configuration
public class ConfigClass {

    @Bean
    public Company getCompany() {
        return new Company("Nike", getAddress(), getEngineer());
    }

    @Bean
    public Address getAddress() {
        return new Address("New York", "Fifth Avenue", 650);
    }

    @Bean
    public Engineer getEngineer() {
        return new Engineer("Ann", Grade.ST);
    }

}
