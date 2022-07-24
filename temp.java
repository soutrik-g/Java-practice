import java.util.*;
class temperature
{
    void convert(String ch, double t)
    {
        double c;
        double f;
        switch(ch)
        {
            case "C":
            c= 5.0/9*(t-32);
            System.out.println("The temperature in celsius is "+c);
            break;
            case "F":
            f= (1.8*t)+32;
            System.out.println("The temperature in farenheit is "+f);
            break;
            default: System.out.println("Choice invalid");
            break;
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        temperature obj= new temperature();
        System.out.println("Enter the scale to be converted into");
        System.out.println("F for farenheit");
        System.out.println("C for celsius");
        String z =sc.nextLine();
        System.out.println("Enter the temperature in the initial scale");
        double e= sc.nextDouble();
        obj.convert(z,e);
    }
}
