package Entity;

import java.util.ArrayList;

public class SumonerRift {
    private ArrayList<Champain> t1;
    private ArrayList<Champain> g2;

    public SumonerRift(ArrayList<Champain> t1, ArrayList<Champain> g2) {
        this.t1 = t1;
        this.g2 = g2;
    }

    @Override
    public String toString() {
        return "SumonerRift{" +
                "\nt1=" + t1 +
                "\ng2=" + g2 +
                '}';
    }
}
