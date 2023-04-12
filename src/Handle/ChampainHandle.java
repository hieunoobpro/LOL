package Handle;
import java.util.Scanner;
import Entity.Champain;
public class ChampainHandle {
    public Champain t1Input(Scanner scanner) {
        System.out.println("Nhap ten tuong: ");
        String name = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String potition = scanner.nextLine();
        return new Champain(name, potition);
    }
}
