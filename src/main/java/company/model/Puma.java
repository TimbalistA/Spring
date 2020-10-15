package company.model;

import org.springframework.stereotype.Component;

@Component("Puma")
public class Puma implements Company {

    private final Engineer engineer;

    public Puma(final Engineer engineer) {
        this.engineer = engineer;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    @Override
    public String toString() {
        return "Puma{" +
                "engineer=" + engineer +
                '}';
    }
}
