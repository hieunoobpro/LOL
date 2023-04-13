import Entity.Figure;
import Entity.SumonerRift;
import Handle.FigureHandle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figure> SKT = new ArrayList<>();
        ArrayList<Figure> G2 = new ArrayList<>();
        FigureHandle figureHandle = new FigureHandle();
        System.out.println("Nhap thoi gian: ");
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Nhap thong tin cho SKT: ");
        for (int i = 0; i < 5; i++) {
            Figure figure = figureHandle.figureInput(scanner);
            SKT.add(figure);
        }
        System.out.println("Nhap thong tin cho G2: ");
        for (int i = 0; i < 5; i++) {
            Figure figure = figureHandle.figureInput(scanner);
            G2.add(figure);
        }
        SumonerRift sumonerRift= new SumonerRift(SKT,G2, localDateTime);
        System.out.println(sumonerRift);
    }
}