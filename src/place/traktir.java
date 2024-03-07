package place;

import java.util.*;

import person.place;
import person.placeobj;

public class traktir extends place {

    public traktir() {
    }

    @Override
    public String getName() {
        return placeobj.traktir.getName();
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