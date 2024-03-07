package actions.dialog;

import base.dosmth;
import base.forwhom;
import base.placeobj;

public class goout implements dosmth {

    @Override
    public String phrase() {
        return "вышел " + "из " + placeobj.traktir.getName()+ " на " +placeobj.street.getName();
    }

    @Override
    public String personname() {
        return forwhom.raskol.getName();
    }
    
    
}
