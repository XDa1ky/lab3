package actions;

import person.forwhom;
import place.placeobj;

public class goout implements dosmth {

    @Override
    public String phrase(String string) {
        string = "вышел";
        return forwhom.raskol.getName() + string + "из" + placeobj.traktir.getName()+ "на" +placeobj.traktir.getName();
    }
    
    
}
