package company.model;

import org.springframework.stereotype.Component;

@Component
public class Engineer {

    private final Grade grade = Grade.EN;

    private final String name = "Iwan";

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
