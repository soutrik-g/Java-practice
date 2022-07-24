import java.util.*;
class geometry
{
    void calc(int x)
    { 
        Scanner sc=new Scanner(System.in);
        
        
        switch(x)
        {
            case 1: System.out.println("Enter radius");
            int r=sc.nextInt();
            double a=3.14*r*r;
            System.out.println(a);
            break;
            case 2 : System.out.println("Enter the length of the side of the square");
            int s=sc.nextInt();
            double q=s*s;
            System.out.println(q);
            break;
            case 3 : System.out.println("Enter the length and bredth ");
            int l=sc.nextInt();
            int b= sc.nextInt();
            int e=l*b;
            System.out.println(e);
            default : System.out.println("Invalid choice");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        geometry obj=new geometry();
        System.out.println("Énter 1 to calculate the area of a circle, 2 for square and 3 for rectangle");
        int x=sc.nextInt();
        obj.calc(x);
    }
}
    
