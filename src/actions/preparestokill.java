package actions;

import base.dosmth;
import base.forwhom;

public class preparestokill implements dosmth{

    @Override
    public String phrase() {
        return "проснувшись сделал петлю и пришил её к одежде";
    }

    @Override
    public String personname() {
        return forwhom.raskol.getName();
    }
    
}
