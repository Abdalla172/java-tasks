
package ncr;

import java.util.Scanner;

public class NCR {

    public static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
           fact=fact*i; 
        }
        return fact;
    }
    public static void main(String[] args) {
        int x,y,Ncr,Npr;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        Ncr=fact(x)/(fact(y)*fact(x-y));
        Npr=fact(x)/fact(x-y);
        System.out.print("Ncr = ");
        System.out.println(Ncr);
        System.out.print("Npr = ");
        System.out.println(Npr);
            
            
      
    }
    
}
