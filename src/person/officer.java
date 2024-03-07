package person;

public class officer extends person {
    public officer(String name) {
        super(name);
    }

    @Override
    String Gender() {
        return "man";
    }

}
