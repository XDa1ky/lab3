package actions;

import base.dosmth;
import base.forwhom;

public class raskolseve implements dosmth {

    @Override
    public String phrase() {
        return "поел и уснул";
    }

    @Override
    public String personname() {
        return forwhom.raskol.getName() ;
    }

}
