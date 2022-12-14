public class car extends vehicle{
    private String brand;
    public car(){}
    public car(String maker ,String color ,String brand){
        super(maker ,color);
        setBrand(brand);
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setMaker(String maker){
        this.maker = maker;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void display(){
        displayMaker();
        displayColor();
        System.out.println("The brand of the car is  : "+brand);
    }
}
