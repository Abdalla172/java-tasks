package ascii;
import java.util.Scanner;
public class ASCII {

   
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Ascii value");
       int x=input.nextInt();
       char asci=(char)x;
        System.out.println("The charater is:"+asci);
       
        
    }
    
}