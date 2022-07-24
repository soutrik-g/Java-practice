import java.util.*;
class Fruitjuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    double product_price;
    void Fruitjuice()
    {
        product_code=0;
        flavour="";
        pack_type="";
        pack_size=0;
        product_price=0;
    }
    void Fruitjuice(int pc,int ps,String f,double pp,String pt)
    {
        product_code=pc;
        flavour=f;
        pack_type=pt;
        pack_size=ps;
        product_price=pp;
    }
    public static void input()
    {
        Fruitjuice obj=new Fruitjuice();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the product code,flavour,pack type,pack size,product price");
        int pc=scan.nextInt();
        String f=scan.next();
        String pt=scan.next();
        int ps=scan.nextInt();
        double pp=scan.nextDouble();
        obj.Fruitjuice(pc,ps,f,pp,pt);
        obj.discount();
        obj.display();
    }
    void discount()
    {
        product_price=product_price-(0.10*product_price);
    }
    void display()
    {
        Fruitjuice obj=new Fruitjuice();
        System.out.println("Product code is "+product_code);
        System.out.println("Flavour is "+flavour);
        System.out.println("Pack type is "+pack_type);
        System.out.println("Pack size is "+pack_size);
        System.out.println("Product price is "+product_price);
        obj.Fruitjuice();
    }
}
