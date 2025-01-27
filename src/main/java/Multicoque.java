public class Multicoque extends Voilier {


    public Multicoque(String nom, SuivreRoute suivreRoute,String nomSkipper,EnumClass classe) {
        super(nom,suivreRoute,nomSkipper,classe);

    }


    public String toString() {
        return nom+" est multicoque";
    }
}
