package company.model;

import org.springframework.stereotype.Component;

@Component("Nike")
public class Nike implements Company {

    private final Engineer engineer;

    public Nike(final Engineer engineer) {
        this.engineer = engineer;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    @Override
    public String toString() {
        return "Nike{" +
                "engineer=" + engineer +
                '}';
    }
}
