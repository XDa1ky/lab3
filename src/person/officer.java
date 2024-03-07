package person;

import base.person;

public class officer extends person {
    public officer(String name) {
        super(name);
    }

    @Override
    protected
    String Gender() {
        return "man";
    }

}
