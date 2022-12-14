public class cylinder extends cricle{
    private double high;
    public cylinder(){
        super();
        this.high =1.0;
    }
    public cylinder(double high)
    {
        super();
        this.high=high;

    }
    public cylinder(double high,double reduis)
    {
        super(reduis);
         this.high=high;
    }
    public cylinder(double high,double redius, String color){
        super(redius,color);
        this.high=high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"high = "+high;
    }
    public double getVolume()
    {
        return (getArea_cricle()*high);
    }


}
