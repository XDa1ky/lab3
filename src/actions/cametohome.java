package actions;

import base.dosmth;
import base.forwhom;
import person.placeobj;

public class cametohome implements dosmth {

    @Override
    public String phrase() {
        return "вернулся с " + placeobj.traktir.getName() +  " домой";
    }

    @Override
    public String personname() {
        return forwhom.raskol.getName(); 
    }
    
}
