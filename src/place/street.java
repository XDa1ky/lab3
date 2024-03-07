package place;

import java.util.*;

import person.place;
import person.placeobj;

public class street extends place {

    @Override
    public String getName() {
        return placeobj.street.getName();
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

}