package company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import company.config.ConfigClass;
import company.model.Address;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);

        Address address = applicationContext.getBean(Address.class);

        System.out.println(address);
    }

}
