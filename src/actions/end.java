package actions;

import base.dosmth;
import base.forwhom;
import base.placeobj;

public class end implements dosmth{

    @Override
    public String phrase() {
        return "вышел на " + placeobj.street.getName();
    }

    @Override
    public String personname() {
        return forwhom.raskol.getName();
    }
    
}
