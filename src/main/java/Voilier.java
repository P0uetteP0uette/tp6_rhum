/**
 * La classe abstraite Voilier représente un voilier avec des attributs de base
 * comme le nom, la stratégie de suivi de route, le nom du skipper et la classe du voilier.
 * Elle fournit des méthodes pour définir et appliquer la stratégie de suivi de route.
 */
public abstract class Voilier {
    /**
     * Le nom du voilier.
     */
    String nom;

    /**
     * La stratégie de suivi de route du voilier.
     */
    SuivreRoute suivreRoute;

    /**
     * Le nom du skipper.
     */
    String nomSkipper;

    /**
     * La classe du voilier.
     */
    EnumClass classe;

    /**
     * Constructeur de la classe Voilier.
     *
     * @param name Le nom du voilier.
     * @param suivreRoute La stratégie de suivi de route du voilier.
     * @param nomSkipper Le nom du skipper.
     * @param classe La classe du voilier.
     */
    public Voilier(String name, SuivreRoute suivreRoute, String nomSkipper, EnumClass classe) {
        this.nom = name;
        this.suivreRoute = suivreRoute;
        this.nomSkipper = nomSkipper;
        this.classe = classe;
    }

    /**
     * Constructeur par défaut de la classe Voilier.
     */
    public Voilier() {
    }

    /**
     * Définit la stratégie de suivi de route pour ce voilier.
     *
     * @param sr La stratégie de suivi de route à appliquer.
     */
    public void setSuivreRoute(SuivreRoute sr) {
        this.suivreRoute = sr;
    }

    /**
     * Applique la stratégie de suivi de route pour ce voilier.
     */
    public void appliquerSuivreRoute() {
        suivreRoute.suivreRoute();
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de ce voilier.
     *
     * @return Une chaîne de caractères représentant le nom de ce voilier.
     */
    @Override
    public String toString() {
        return nom;
    }
}
