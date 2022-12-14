public class cricle {
    protected double redius;
    protected String color;
    public cricle()
    {
        this.redius =1.0;
        this.color ="red";
    }
    public  cricle(double redius)
    {
        this.redius=redius;
        this.color ="red";
    }
    public cricle(double redius, String Color)
    {
        this.redius =redius;
         this.color = color;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
    public void setColor(String color)
    {
        this.color=color;
    }

    public double getRedius() {
        return this.redius;
    }

    public String getColor() {
        return this.color;
    }
public String toString()
{
    return "redius="+redius+"\n"+"color ="+color;
}
    public double getArea_cricle(){
        return (redius* redius* 3.14);
    }

}
