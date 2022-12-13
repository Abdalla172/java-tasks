
package bank;

import java.util.Scanner;  

public class Bank {

    
    public static void main(String[] args) {
        bankAccount a1=new bankAccount("1","Abdalla",17000);
        bankAccount a2=new bankAccount("2","Ahmed",12000);
        int ch;
        do
        {
            Scanner sc = new Scanner(System.in);
        System.out.println("choose 1 for show balance ");
        System.out.println("choose 2 for deposit ");
        System.out.println("choose 3 for withdraw ");
        System.out.println("choose 4 for exit ");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                a1.showBalance();
                break;
            case 2:
                a1.deposit();
                break;
            case 3:
                a1.withdraw();
                break;
            case 4:
                System.out.println("See you soon...");  
                        break; 
                
                
        }
        }
        while (ch!=4);
        
    }
    
}
