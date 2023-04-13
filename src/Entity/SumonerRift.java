package Entity;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SumonerRift {
    private ArrayList<Figure> SKT;
    private ArrayList<Figure> G2;

    private LocalDateTime Time;

    public SumonerRift(ArrayList<Figure> SKT, ArrayList<Figure> g2, LocalDateTime time) {
        this.SKT = SKT;
        this.G2 = g2;
        this.Time = time;
    }

    @Override
    public String toString() {
        return "SumonerRift{" +
                "\nSKT=" + SKT +
                "\nG2=" + G2 +
                "\nTime=" + Time +
                '}';
    }
}
