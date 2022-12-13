
package cylinder;


public class cylinder_class extends circle_class {
    double higth;
    
    public cylinder_class()
    {}

    public cylinder_class(double h)

    {
      higth=h;
   }
     public cylinder_class(double h , double r )       
     {
        super(r);
        higth=h;    
     }
      public cylinder_class(double h , double r , String c )       
     {
        super(r ,c);
        higth=h;
     }
      public void sethigth (double h)
      {
       h=higth;
      }
      public double gethigth(){
      
      return higth;
      }
      public double getvolume(){
          return higth*this.getradius()*this.getradius()*3.14;
      }
      
}
