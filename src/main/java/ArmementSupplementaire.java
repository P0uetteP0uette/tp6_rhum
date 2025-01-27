public abstract class ArmementSupplementaire extends Voilier {

    public Voilier voilierDecore;

    public ArmementSupplementaire(Voilier vd) {
        super();
        this.voilierDecore = vd;
    }

    @Override
    public void setSuivreRoute(SuivreRoute sr){
        voilierDecore.suivreRoute = sr;
    }

    @Override
    public void appliquerSuivreRoute(){
        voilierDecore.appliquerSuivreRoute();
    }

    @Override
    public String toString() {
        return voilierDecore.toString();
    }
}
