
package cylinder;


public class Cylinder {

    
    public static void main(String[] args) {
        circle_class a1 = new circle_class(10,"blue");
    System.out.println("the color is "+ a1.getcolor());
    System.out.println("the radius ="+ a1.getradius());
    System.out.println("the area of cricle ="+ a1.getarea());
    cylinder_class a2 = new cylinder_class(100,10,"blue");
    System.out.println("the higth of cylinder ="+ a2.gethigth());
    System.out.println("the volume of cylinder = "+ a2.getvolume());
    }
    
}
