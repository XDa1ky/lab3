package actions;

import base.dosmth;
import base.forwhom;
import base.placeobj;
import place.home;

public class cametohome implements dosmth {

    @Override
    public String phrase() {
        return "вернулся с " + placeobj.traktir.getName() + "в"+ placeobj.home.getName();
    }

    @Override
    public String personname() {
        return forwhom.raskol.getName(); 
    }
    
}
