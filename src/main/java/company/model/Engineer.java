package company.model;

import org.springframework.stereotype.Component;

@Component
public class Engineer {

    private final String name = "Ann";

    private final Grade grade = Grade.ST;

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
