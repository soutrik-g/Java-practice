
import java.util.Scanner;
import java.*;
class BankofIndia
{
    
    double calculate(int p,int term,int age)
    {
        double amount=0;
        if(age<=60)
        {
            if(term<=1)
            amount=(7.5/100*p*term)+p;
            else if(term<=2)
            amount=(8.5/100*p*term)+p;
            else if(term<=3)
            amount=(9.5/100*p*term)+p;
            else if(term>3)
            amount=(10/100*p*term)+p;
        }
        else if(age>60)
        {
            if(term<=1)
            amount=(8/100*p*term)+p;
            else if(term<=2)
            amount=(9/100*p*term)+p;
            else if(term<=3)
            amount=(10/100*p*term)+p;
            else if(term>3)
            amount=(11/100*p*term)+p;
        }
        return amount;
    }
    public static void main()
    {
        int age;
        int p;
        int term;
        double amount;
        double interest;
        BankofIndia obj=new BankofIndia();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter amount:");
        p=scan.nextInt();
        System.out.println("Enter term:");
        term=scan.nextInt();
        System.out.println("Enter age:");
        age=scan.nextInt();
        amount=obj.calculate(p,term,age);
        interest=amount-p;
        System.out.println("Amount:"+p);
        System.out.println("Term:"+term);
        System.out.println("Age:"+age);
        System.out.println("Interest:"+interest);
    }
}
            
            
            
