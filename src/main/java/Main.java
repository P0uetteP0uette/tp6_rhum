/**
 * La classe Main contient le point d'entrée du programme. Elle crée des instances 
 * de routes, d'inscriptions et de voiliers, enregistre les voiliers et affiche la 
 * liste des voiliers inscrits.
 */
public class Main {
        public static void main(String[] args) {
                RouteAlize routeAlize = new RouteAlize();
                RouteOrthodromie routeOrthodromie = new RouteOrthodromie();

                IncriptionMonocoque inscriptionMonocoque = new IncriptionMonocoque();
                IncriptionMulticoque inscriptionMulticoque = new IncriptionMulticoque();

                Voilier v1 = inscriptionMonocoque.factoryMethod("zebi", routeAlize, "sky1", EnumClass.EnumMono);
                Voilier v2 = inscriptionMulticoque.factoryMethod("vroum", routeOrthodromie, "sky2", EnumClass.EnumMulti);

                inscriptionMonocoque.enregistrement(v1);
                inscriptionMulticoque.enregistrement(v2);

                // Affiche la liste des voiliers inscrits
                System.out.println(InscriptionVoilier.listeInscription);
        }
}
