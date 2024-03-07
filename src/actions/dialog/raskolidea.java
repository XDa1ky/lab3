package actions.dialog;

import base.dosmth;
import base.forwhom;

public class raskolidea implements dosmth {

    @Override
    public String phrase() {
        return "убил бы старуху и ограбил без всякого зазору совести";
    }

    @Override
    public String personname() {
        return forwhom.raskol.getName() ;
    }
    
}
