package actions.dialog;

import base.dosmth;
import base.forwhom;

public class raskolanswer implements dosmth {

    @Override
    public String phrase() {
        return  " «Разумеется, нет!Я так только говорю… для справедливости»" ;
    }
    @Override
    public String personname() {
        return forwhom.raskol.getName(); 
    }
    
}
