
package lab3;

public class triangle {
    private double a;
    private double b;
    private double c;
    public void seta(double x)
    {
        a = x;
    }
    public void setb(double y)
    {
        b = y;
    }
    public void setc(double z)
    {
        c = z;
    }
    public double getperimeter()
    {
        return a+b+c;
    }
    public double getarea()
    {
        double r=((a+b+c)/2);
        double aa=Math.sqrt(r*(r-a)*(r-b)*(r-c));
        return aa ;
    }
     
}
