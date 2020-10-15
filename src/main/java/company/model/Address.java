package company.model;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private final String country = "New York";

    private final String name = "Fifth Avenue";

    private final int number = 650;

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
