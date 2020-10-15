package company.model;

public class Address {

    private final String country;

    private final String name;

    private final int number;

    public Address(final String country, final String name, final int number) {
        this.country = country;
        this.name = name;
        this.number = number;
    }

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
