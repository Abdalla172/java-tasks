
package bank;

import java.util.Scanner;  

public class bankAccount {
    private String id;
    private String name;
    private double balance;
    Scanner sc = new Scanner(System.in);
    public bankAccount(String accid,String n, double b)
    {
        this.id=accid;
        this.name=n;
        this.balance=b;
          
    }
    public void set_name(String n)
    {
        this.name=n;
    }
    public void set_id(String accid)
    {
        this.id=accid;
    }
    
    //method to deposit money  
    public void deposit()
    {
        double a;
        System.out.println("Enter the amount you want to deposit:");
        a=sc.nextDouble();
        this.balance+=a;
        
    }
    //method to withdraw money
    public void withdraw()
    {
        double a;
        System.out.println("Enter the amount you want to withdraw: "); 
        a=sc.nextDouble();
        if(balance>=a)
        {
            this.balance-=a;
            System.out.println("Balance after withdrawal: " + balance);  
        }
        else
        {
            System.out.println("Your balance is less than " + a + "\tTransaction failed...!!" );  
        }
        
    }
    public void showBalance()
        {
            System.out.println("Your balance is :" +balance );  
        }
//    public void showMenue()
//    {
//        int ch;
//        System.out.println("choose 1 for show balance ");
//        System.out.println("choose 2 for deposit ");
//        System.out.println("choose 3 for withdraw ");
//        ch=sc.nextInt();
//        switch (ch)
//        {
//            case 1:
//                
//        }
//        
//    }
}
