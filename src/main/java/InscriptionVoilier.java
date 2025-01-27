import java.util.ArrayList;
import java.util.List;

/**
 * La classe abstraite InscriptionVoilier représente un processus général
 * d'inscription pour les voiliers. Elle contient une méthode abstraite
 * factoryMethod pour créer des objets Voilier et une méthode pour enregistrer
 * les voiliers inscrits.
 */
public abstract class InscriptionVoilier {
    /**
     * Liste des voiliers inscrits.
     */
    static List<Voilier> listeInscription = new ArrayList<>();

    /**
     * Méthode de fabrique abstraite pour créer des voiliers en fonction des
     * paramètres fournis.
     *
     * @param nom Le nom du voilier.
     * @param suivreRoute La stratégie de suivi de route du voilier.
     * @param nomSkipper Le nom du skipper.
     * @param classe La classe du voilier.
     * @return Un objet Voilier.
     */
    public abstract Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClass classe);

    /**
     * Enregistre un voilier dans la liste des inscriptions.
     *
     * @param voilier Le voilier à enregistrer.
     */
    void enregistrement(Voilier voilier) {
        listeInscription.add(voilier);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la liste des
     * voiliers inscrits.
     *
     * @return Une chaîne de caractères représentant la liste des voiliers inscrits.
     */
    @Override
    public String toString() {
        return listeInscription.toString();
    }
}
