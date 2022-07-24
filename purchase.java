
import java.util.*;
class purchase
{
    void calculate(char ch, double amount)
    {
        double discount;
        double netamt;
        switch (ch)
        {
            case 'L':
            if(amount<25000)
            {
                discount= 0;
            }
            else if(amount>25001 && amount<=57000)
            {
            discount= 5.0/100*amount;
        }
        else if(amount>57001 && amount< 100000)
        {
            discount= 7.5/100*amount;
        }
        else
        {
            discount= 10.0/100*amount;
        }
        netamt=amount-discount;
        System.out.println("Total amount payable is "+ netamt);
        break;
        case 'P':
        if(amount<25000)
            {
                discount= 5.0/100*amount;
            }
            else if(amount>25001 && amount<=57000)
            {
            discount= 7.5/100*amount;
        }
        else if(amount>57001 && amount< 100000)
        {
            discount= 10.0/100*amount;
        }
        else
        {
            discount= 15.0/100*amount;
        }
        netamt= amount-discount;
        System.out.println("Total amount payable is "+ netamt);
        break;
        default: System.out.println("Invalid choice");
        break;
    }
}
public static void main()
{
    Scanner sc=new Scanner (System.in);
    purchase obj= new purchase();
    System.out.println("Enter the device code");
    System.out.println("L for laptop");
    System.out.println("P for desktop");
    char z = sc.next().charAt(0);
    System.out.println("Enter the amount");
    double a= sc.nextDouble();
    obj.calculate(z,a);
}
}
