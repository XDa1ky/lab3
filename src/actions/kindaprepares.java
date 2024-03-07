package actions;

import base.dosmth;
import base.forwhom;

public class kindaprepares implements dosmth{

    @Override
    public String phrase() { 
        return "завернул в бумагу две дощечки и несколько раз перевязал их нитками";
    }
    @Override
    public String personname() {
        return forwhom.raskol.getName();
    }
    

}
