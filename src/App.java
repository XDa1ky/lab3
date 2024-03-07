import person.forwhom;
import person.grandma;
import person.officer;
import person.raskol;
import place.street;
import place.traktir;

public class App {
    public static void main(String[] args) throws Exception {
        officer officer = new officer(forwhom.Officer.getName());
        raskol raskol = new raskol(forwhom.raskol.getName());
        grandma grandma = new grandma(forwhom.Grandma.getName());
        traktir traktir = new traktir();
        street street = new street();
        System.out.println(street.hashCode());
    }
}
