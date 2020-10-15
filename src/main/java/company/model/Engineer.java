package company.model;

public class Engineer {

    private final String name;

    private final Grade grade;

    public Engineer(final String name, final Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
