package person;

public enum placeobj {
    traktir("трактир"), street("улица");
    private String name;
    placeobj (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
