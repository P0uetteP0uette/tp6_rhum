import java.util.ArrayList;
import java.util.List;

public abstract class InscriptionVoilier {
    static List<Voilier> listeInscription = new ArrayList<>();

    public abstract Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClass classe);

    void enregistrement(Voilier voilier){
        listeInscription.add(voilier);
    }

    public String toString(){
        return listeInscription.toString();
    }

}
