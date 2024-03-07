package place;

import java.util.*;

import base.placeobj;
import person.place;

public class home extends place {

    public home() {
    }

    @Override
    public String getName() {
        return placeobj.home.getName();
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