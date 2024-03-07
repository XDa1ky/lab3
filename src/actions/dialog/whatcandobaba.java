package actions.dialog;

import base.dosmth;
import base.forwhom;

public class whatcandobaba implements dosmth {

    @Override
    public String phrase() {
        return "Может сразу пять тысяч выдать. Свою глуповатую сестру Лизавету она бьет поминутно ";
    }

    @Override
    public String personname() {
        return forwhom.Grandma.getName();
    }

}
