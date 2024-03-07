package actions.dialog;

import base.dosmth;
import base.forwhom;

public class officerskidding implements dosmth{

    @Override
    public String phrase() {
        return "«Вот ты ораторствуешь, а скажи: убьешь ты сам старуху или нет?»";
    }

    @Override
    public String personname() {
        return forwhom.Officer.getName() ;
    }
    
}
