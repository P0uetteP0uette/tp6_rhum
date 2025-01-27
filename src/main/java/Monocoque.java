/**
 * La classe Monocoque représente un type spécifique de voilier monocoque.
 * Elle hérite de la classe Voilier.
 */
public class Monocoque extends Voilier {

    /**
     * Constructeur de la classe Monocoque.
     *
     * @param nom Le nom du voilier.
     * @param suivreRoute La stratégie de suivi de route du voilier.
     * @param nomSkipper Le nom du skipper.
     * @param classe La classe du voilier.
     */
    public Monocoque(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClass classe) {
        super(nom, suivreRoute, nomSkipper, classe);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de ce voilier monocoque.
     *
     * @return Une chaîne de caractères représentant ce voilier monocoque.
     */
    @Override
    public String toString() {
        return nom + " est monocoque";
    }
}
