package company.model;

public class Company {

    private final String name;

    private final Address address;

    private final Engineer engineer;

    public Company(final String name, final Address address, final Engineer engineer) {
        this.name = name;
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
