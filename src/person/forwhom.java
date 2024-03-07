package person;

public enum forwhom {
    Officer("офицер"), raskol("Раскольников"), Grandma("бабка"),anastasia("Настасья");
    private String name;
    forwhom (String name){
        this.name =name;
    }
    public String getName() {
        return name;
    }
}
