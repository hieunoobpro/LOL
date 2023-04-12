import Entity.Champain;
import Entity.SumonerRift;
import Handle.ChampainHandle;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Champain> t1 = new ArrayList<>();
        ArrayList<Champain> g2 = new ArrayList<>();
        ChampainHandle champainHandle = new ChampainHandle();
        System.out.println("Nhap thong tin cho T1: ");
        for (int i = 0; i < 5; i++) {
            Champain champain = champainHandle.t1Input(scanner);
            t1.add(champain);
        }
        System.out.println("Nhap thong tin cho G2: ");
        for (int i = 0; i < 5; i++) {
            Champain champain = champainHandle.t1Input(scanner);
            g2.add(champain);
        }
        SumonerRift sumonerRift= new SumonerRift(t1,g2);
        System.out.println(sumonerRift);
    }
}