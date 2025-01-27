/**
 * La classe RouteOrthodromie implémente l'interface SuivreRoute.
 * Elle représente la route orthodromique.
 */
public class RouteOrthodromie implements SuivreRoute {

    /**
     * Méthode pour suivre la route orthodromique.
     * Affiche un message indiquant que vous suivez la route orthodromique.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Vous suivez la route orthodromie");
    }
}
