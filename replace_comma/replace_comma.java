import java.util.Scanner;
public class replace_comma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.replaceAll(",","");
        System.out.print(s);

    }
}
