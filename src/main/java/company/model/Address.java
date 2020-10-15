package company.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Address {

    private final String name;

    private final int number;

    private final String country;

    @Autowired
    @Qualifier("Nike")
    private Company company;

    public Address(final String country, final String name, final int number) {
        this.country = country;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", company=" + company +
                '}';
    }
}
