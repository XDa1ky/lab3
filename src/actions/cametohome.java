package actions;

import person.forwhom;
import place.placeobj;

public class cametohome implements dosmth {

    @Override
    public String phrase(String string) {
        string = "вернулся с";
        return forwhom.raskol.getName() + string + placeobj.traktir.getName() +  "домой";
    }
    
}
