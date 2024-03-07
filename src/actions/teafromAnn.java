package actions;

import person.forwhom;

public class teafromAnn implements dosmth  {

    @Override
    public String phrase(String string) {
        string = "принесла чай и суп для";
        return forwhom.anastasia.getName() + string + forwhom.raskol.getName();
    }
    
}
