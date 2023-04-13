package Entity;

import java.util.ArrayList;

public class SumonerRift {
    private ArrayList<Figure> SKT;
    private ArrayList<Figure> G2;

    public SumonerRift(ArrayList<Figure> SKT, ArrayList<Figure> G2) {
        this.SKT = SKT;
        this.G2 = G2;
    }

    @Override
    public String toString() {
        return "SumonerRift{" +
                "\nSKT = " + SKT +
                "\nG2 = " + G2 +
                '}';
    }
}
