import actions.cametohome;
import actions.end;
import actions.kindaprepares;
import actions.preparestokill;
import actions.raskolseve;
import actions.teafromAnn;
import actions.dialog.goout;
import actions.dialog.officerskidding;
import actions.dialog.raskolanswer;
import actions.dialog.raskolidea;
import actions.dialog.whatcandobaba;
import base.forwhom;
import person.anastasia;
import person.grandma;
import person.officer;
import person.raskol;
import place.street;
import place.traktir;

public class App {
    public static void main(String[] args) {
        officer officer = new officer(forwhom.Officer.getName());
        raskol raskol = new raskol(forwhom.raskol.getName());
        grandma grandma = new grandma(forwhom.Grandma.getName());
        anastasia anastasia = new anastasia(forwhom.anastasia.getName());
        traktir traktir = new traktir();
        street street = new street();
        //1
        whatcandobaba whatcandobaba = new whatcandobaba();
        raskolidea raskolidea = new raskolidea();
        officerskidding officerskidding = new officerskidding();
        raskolanswer raskolanswer = new raskolanswer();
        goout goout = new goout();
        //2
        cametohome cametohome = new cametohome();
        teafromAnn teafromAnn = new teafromAnn();
        raskolseve raskolseve = new raskolseve();
        preparestokill preparestokill = new preparestokill();
        kindaprepares kindaprepares = new kindaprepares();
        end end = new end();
        //main
        grandma.doAction(whatcandobaba, "");
        raskol.doAction(raskolidea, "");
        officer.doAction(officerskidding,raskol.getName());
        raskol.doAction(raskolanswer,officer.getName());
        raskol.doAction(goout,"");
        raskol.doAction(cametohome, "");
        anastasia.doAction(teafromAnn, "");
        raskol.doAction(raskolseve, "");
        raskol.doAction(preparestokill, "");
        raskol.doAction(kindaprepares, "");
        raskol.doAction(end, "");
    }
}
