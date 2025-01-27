/**
 * La classe ArmementFoils représente un type spécifique d'armement supplémentaire
 * pour un voilier. Elle hérite de la classe ArmementSupplementaire.
 */
public class ArmementFoils extends ArmementSupplementaire {

    /**
     * Constructeur de la classe ArmementFoils.
     *
     * @param voilier Le voilier auquel cet armement supplémentaire sera associé.
     */
    public ArmementFoils(Voilier voilier) {
        super(voilier);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de cet
     * armement.
     *
     * @return "ArmementFoils" - le nom de cette classe d'armement supplémentaire.
     */
    @Override
    public String toString() {
        return "ArmementFoils";
    }
}
