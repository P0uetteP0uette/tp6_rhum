/**
 * La classe IncriptionMulticoque représente une inscription spécifique pour les voiliers multicoques.
 * Elle hérite de la classe InscriptionVoilier.
 */
public class IncriptionMulticoque extends InscriptionVoilier {

    /**
     * Méthode de fabrique pour créer un voilier en fonction des paramètres fournis.
     *
     * @param nom Le nom du voilier.
     * @param suivreRoute La stratégie de suivi de route du voilier.
     * @param nomSkipper Le nom du skipper.
     * @param classe La classe du voilier (EnumMono ou autre).
     * @return Un objet Voilier, soit un Monocoque soit un Multicoque en fonction de la classe.
     */
    @Override
    public Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClass classe) {
        if (classe == EnumClass.EnumMono) {
            return new Monocoque(nom, suivreRoute, nomSkipper, classe);
        } else {
            return new Multicoque(nom, suivreRoute, nomSkipper, classe);
        }
    }

    /**
     * Enregistre un voilier dans la liste des inscriptions.
     *
     * @param voilier Le voilier à enregistrer.
     */
    public void enregistrement(Voilier voilier) {
        listeInscription.add(voilier);
    }
}
