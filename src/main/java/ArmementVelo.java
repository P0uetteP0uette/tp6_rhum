/**
 * La classe ArmementVelo représente un type spécifique d'armement supplémentaire
 * pour un voilier. Elle hérite de la classe ArmementSupplementaire.
 */
public class ArmementVelo extends ArmementSupplementaire {

    /**
     * Constructeur de la classe ArmementVelo.
     *
     * @param voilier Le voilier auquel cet armement supplémentaire sera associé.
     */
    public ArmementVelo(Voilier voilier) {
        super(voilier);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de cet
     * armement.
     *
     * @return "ArmementVelo" - le nom de cette classe d'armement supplémentaire.
     */
    @Override
    public String toString() {
        return "ArmementVelo";
    }
}
