package base;

public enum placeobj {
    traktir("трактир"), street("улица"),home("дом");
    private String name;
    placeobj (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
