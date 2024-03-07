package person;


public abstract class place {
    protected place place = null;

    public abstract String getName();

    public place getPlace() {
        return place;
    }

    public void setPlace(place place) {
        this.place = place;
    }
}