/**
 * La classe RouteAlize implémente l'interface SuivreRoute.
 * Elle représente la route des alizés.
 */
public class RouteAlize implements SuivreRoute {

    /**
     * Méthode pour suivre la route des alizés.
     * Affiche un message indiquant que vous suivez la route des alizés.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Vous suivez la route des alizés");
    }
}
