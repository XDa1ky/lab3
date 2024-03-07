package actions;

import base.dosmth;
import base.forwhom;

public class teafromAnn implements dosmth  {

    @Override
    public String phrase() {
        return  "принесла чай и суп для " + forwhom.raskol.getName();
    }

    @Override
    public String personname() {
        return forwhom.anastasia.getName();
    }
    
}
