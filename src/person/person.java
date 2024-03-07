package person;

import java.util.Objects;

public abstract class person {
    protected String Name;

    public person(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    abstract String Gender();

    public int hashCode() {
        return Objects.hash(Name);
    }
}