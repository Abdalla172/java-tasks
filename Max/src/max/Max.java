
package max;
import java.util.Scanner;
public class Max {

    
    public static void main(String[] args) {
        System.out.println("Enter The Size of The Array");
        Scanner input=new Scanner(System.in);
        int Size=input.nextInt();
        float max=0;
        float arr[]=new float[Size];
        System.out.println("Enter The Items of The Array");
        for(int i=0;i<Size;i++)
        {
            arr[i]=input.nextFloat();
            if (arr[i]>max)
                    max=arr[i];
        }
        System.out.println("The Largest item ="+max);
    }
    
}
