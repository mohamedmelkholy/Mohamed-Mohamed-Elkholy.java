import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String color ,maker,brand;
        Scanner scanner = new Scanner(System.in);
        car c1 = new car();
        System.out.println("Enter color, maker and brand of the car :");

        color = scanner.nextLine();
        maker = scanner.nextLine();
        brand = scanner.nextLine();

        c1.setBrand(brand);
        c1.setColor(color);
        c1.setMaker(maker);
        c1.display();
    }
}
