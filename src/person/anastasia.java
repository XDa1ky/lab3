package person;

import base.person;

public class anastasia extends person {
    public anastasia(String name) {
        super(name);
    }

    @Override
    protected String Gender() {
        return "women";
    }

}
