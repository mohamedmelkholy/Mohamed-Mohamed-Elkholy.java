public class viechle {
    protected String maker;
    protected String color;

    public viechle(String maker , String color){
        this.maker = maker;
        this.color = color;
    }
    protected void displayMaker(){
        System.out.println("The maker of the viechle is : "+maker);
    }
    protected void displayColor(){
        System.out.println("The color of the viechle is : "+color);
    }
}
