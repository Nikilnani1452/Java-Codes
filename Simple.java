import java.util.*;
public class Simple
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("NEW ORDER [Y/N]: ");
        String order = sc.nextLine();
        System.out.println("MENU");
        System.out.println("*****\n");
        System.out.println("1.Krusty Burger  120\n2.Milkshake 100\n3.Krusty Meal Set [Burger + Drink + Krusty Laugh]: 200");
        System.out.print("\nENTER ORDER FOR KRUSTY BURGER:");
        int burgernum = sc.nextInt();
        System.out.print("\nENTER ORDER FOR MILKSHAKE :");
         int milk = sc.nextInt();
         System.out.print("\nENTER ORDER FOR KRUSTY MEAL SET[BURGER+DRINK+KRUSTY LAUGH] :");
         int meal = sc.nextInt();
         System.out.println("\nORDER SUMMARY");
         System.out.println("\nKrusty Burger  :  120*"+burgernum);
         System.out.println("\n MILKSHAKE      :  100*"+milk);
         System.out.println("\nKrusty  Meal Set [Burger + Drink + Krusty Laugh]:200*"+meal);
        int subtotal;
        subtotal = 120*burgernum+100*milk+200*meal;
        System.out.println("\nSUB TOTAL:"+subtotal);
        int gst=50;
        System.out.println("\nGST = 50");
        int total;
        total=subtotal+gst;
        System.out.println("\nTOTAL: "+total);
    }
}