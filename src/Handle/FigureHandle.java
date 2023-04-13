package Handle;
import Entity.Figure;

import java.util.Scanner;

public class FigureHandle {
    public Figure figureInput(Scanner scanner) {
        System.out.println("Nhap ten tuong: ");
        String name = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String potition = scanner.nextLine();
        return new Figure(name, potition);
    }
}
