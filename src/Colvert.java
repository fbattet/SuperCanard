/**
 * Created by association on 14/12/16.
 */
public class Colvert extends Canard {
    public Colvert() {
        comportementCancan = new Cancan();
        comportementVol = new VolerAvecDesAiles();
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un vrai colvert");
    }
}
