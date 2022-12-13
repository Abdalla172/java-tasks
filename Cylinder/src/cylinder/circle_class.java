
package cylinder;


public class circle_class {
    double radius ;
    String color ;

       public circle_class ()
            {}    
        public circle_class (double r )
              { 
               r=radius;
              }
                public circle_class (double r , String c)
                {
                    radius=r;
                    color=c;
                }
                 public void setradius(double r) 
                  {
                     radius=r;
                  }
                 public double getradius(){
                 
                     return radius;
                 
                 } 
                public void setcolor(String s){
                color=s;
                 } 
                public String getcolor()
                {
                return color;
                }
                public double getarea(){
                
                return (this.getradius()*this.getradius()*3.14);
                }
}
