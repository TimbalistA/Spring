package company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import company.config.ConfigClass;
import company.model.Company;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        Company company = applicationContext.getBean(Company.class);

        System.out.println(company);
    }

}
