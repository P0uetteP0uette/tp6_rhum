/**
 * La classe abstraite ArmementSupplementaire représente un type d'armement supplémentaire
 * pour un voilier. Elle hérite de la classe Voilier et contient un attribut voilierDecore
 * représentant le voilier décoré avec cet armement supplémentaire.
 */
public abstract class ArmementSupplementaire extends Voilier {

    /**
     * Le voilier décoré par cet armement supplémentaire.
     */
    public Voilier voilierDecore;

    /**
     * Constructeur de la classe ArmementSupplementaire.
     *
     * @param vd Le voilier à décorer avec cet armement supplémentaire.
     */
    public ArmementSupplementaire(Voilier vd) {
        super();
        this.voilierDecore = vd;
    }

    /**
     * Définit la route à suivre pour ce voilier.
     *
     * @param sr La route à suivre.
     */
    @Override
    public void setSuivreRoute(SuivreRoute sr) {
        voilierDecore.suivreRoute = sr;
    }

    /**
     * Applique la route à suivre pour ce voilier.
     */
    @Override
    public void appliquerSuivreRoute() {
        voilierDecore.appliquerSuivreRoute();
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de ce voilier décoré.
     *
     * @return Une chaîne de caractères représentant ce voilier décoré.
     */
    @Override
    public String toString() {
        return voilierDecore.toString();
    }
}
