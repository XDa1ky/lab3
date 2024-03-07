package base;

import java.util.Objects;

public abstract class person {
    protected String Name;

    public person(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    protected abstract String Gender();

    public int hashCode() {
        return Objects.hash(Name);
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        person that = (person) o;
        return Objects.equals(Name, that.Name);
    }

    public void doAction(dosmth a, String what) {
        String s = a.phrase();
        if (what != "") {
            System.out.println(this.Name + " сказал " + what + "у" + " " + s + " ");
        }

        else {
            System.out.println(this.Name + " " + s + " " + what);
        }
    }
}