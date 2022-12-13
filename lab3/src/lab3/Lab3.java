
package lab3;

public class Lab3 {

   
    public static void main(String[] args) { 
        circle c = new circle();
        c.setraduis(10);
        c.getraduis();
        c.getarea();
        c.getperimeter();
        System.out.println(c.getarea());
        System.out.println(c.getperimeter());
        
        triangle t = new triangle();
        t.seta(6);
        t.setb(6);
        t.setc(6);
        t.getarea();
        t.getperimeter();
        System.out.println(t.getarea());
        System.out.println( t.getperimeter());
    }
    
}
