import java.util.*;
class ITD
{
    void calculate (double income)
    {
        double deduction;
        if(income<=100000)
        {
        deduction= 0;
        System.out.println("The tax payable is"+ deduction);
    }
        else if(income>=100001 && income<=500000)
        {
            deduction= 1000+(10/100.0)*(income-1000000);
            System.out.println("The tax payable is"+ deduction);
        }
        else if (income>=500001 && income<=800000)
        {
            deduction= 5000+(20/100.0)*(income-500000);
            System.out.println("The tax payable is"+ deduction);
        }
        else
        {
            deduction= 10000+(30/100.0)*(income-800000);
            System.out.println("The tax payable is"+ deduction);
        }
    }
        public static void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter income");
        double x= sc.nextDouble ();
        ITD obj = new ITD ();
        obj.calculate(x);
    }

}
        
