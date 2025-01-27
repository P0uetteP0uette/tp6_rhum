public class IncriptionMonocoque extends InscriptionVoilier{

    @Override
    public Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClass classe){
        if(classe == EnumClass.EnumMono){
            return new Monocoque(nom,suivreRoute,nomSkipper,classe);
        } else {
            return new Multicoque(nom,suivreRoute,nomSkipper,classe);
        }
    }

    public void enregistrement(Voilier voilier){
        listeInscription.add(voilier);
    }

}
