
package lab3;

public class circle {
    private double raduis;
    public void setraduis(double r)
    {
       raduis=r; 
    }
    public double getraduis()
    {
        return raduis;
    }
    public double getarea()
    {
        return 3.14*raduis*raduis;
    }
    public double getperimeter()
    {
        return 2*3.14*raduis;
    }
    
}
