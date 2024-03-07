package actions;

import person.forwhom;

public class raskolseve implements dosmth {

    @Override
    public String phrase(String string) {
        string = "поел и уснул";
        return forwhom.raskol.getName() + string;
    }

}
