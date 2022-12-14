import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String color ,maker,brand;
        Scanner scanner = new Scanner(System.in);
        car c = new car();
        System.out.println("Enter color, maker and brand of the car :");

        color = scanner.nextLine();
        maker = scanner.nextLine();
        brand = scanner.nextLine();

        c.setBrand(brand);
        c.setColor(color);
        c.setMaker(maker);
        c.display();


    }
}