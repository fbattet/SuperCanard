/**
 * Created by association on 14/12/16.
 */
public class MiniSimulateur {
    public static void main(String[] args) {
        Canard colvert = new Colvert();
        colvert.effectuerCancan();
        colvert.effectuerVol();

        Canard proto = new PrototypeCanard();
        proto.effectuerVol();
        proto.setComportementVol(new PropulsionAReaction());
        proto.effectuerVol();
    }
}
