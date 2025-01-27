public class Monocoque extends Voilier {

    public Monocoque(String nom, SuivreRoute suivreRoute,String nomSkipper,EnumClass classe) {
        super(nom,suivreRoute,nomSkipper,classe);

    }


    public String toString() {
        return nom+" est monocoque";
    }
}
