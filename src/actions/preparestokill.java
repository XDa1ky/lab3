package actions;

import person.forwhom;

public class preparestokill implements dosmth{

    @Override
    public String phrase(String string) {
        string = "сделал петлю и пришил её к одежде,";
        return forwhom.raskol.getName() + string;
    }
    
}
