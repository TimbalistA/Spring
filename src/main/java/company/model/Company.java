package company.model;

import org.springframework.stereotype.Component;

@Component
public class Company {

    private final String name = "Nike";

    private final Address address;

    private final Engineer engineer;

    public Company(final Address address, final Engineer engineer) {
        this.address = address;
        this.engineer = engineer;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", engineer=" + engineer +
                '}';
    }
}
