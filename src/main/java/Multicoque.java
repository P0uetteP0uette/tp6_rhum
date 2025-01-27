/**
 * La classe Multicoque représente un type spécifique de voilier multicoque.
 * Elle hérite de la classe Voilier.
 */
public class Multicoque extends Voilier {

    /**
     * Constructeur de la classe Multicoque.
     *
     * @param nom Le nom du voilier.
     * @param suivreRoute La stratégie de suivi de route du voilier.
     * @param nomSkipper Le nom du skipper.
     * @param classe La classe du voilier.
     */
    public Multicoque(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClass classe) {
        super(nom, suivreRoute, nomSkipper, classe);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de ce voilier multicoque.
     *
     * @return Une chaîne de caractères représentant ce voilier multicoque.
     */
    @Override
    public String toString() {
        return nom + " est multicoque";
    }
}
    