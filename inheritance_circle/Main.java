public class Main {
    public static void main(String[] args) {
        cricle c1=new cricle();
        cylinder cl1=new cylinder();
        System.out.println( cl1.getRedius());
        cl1.setHigh(5);
        c1.setColor("red");
        System.out.println(cl1.getVolume());
        System.out.println(cl1.toString());
        System.out.println(c1.getArea_cricle());

    }
}