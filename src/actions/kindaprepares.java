package actions;

import person.forwhom;

public class kindaprepares implements dosmth{

    @Override
    public String phrase(String string) {
        string = "завернул в бумагу две дощечки и несколько раз перевязал их нитками";
        return forwhom.raskol.getName() + string;
    }
    

}
