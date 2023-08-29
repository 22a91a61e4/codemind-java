import java.util.Scanner;
public class bill{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        String n=sc.nextLine();
        int u=sc.nextInt();
        double U;
        if(u<=199)
        {
            U=u*1.20;
        }
        else if(u>=200 && u<400)
        {
            U=u*1.50;
        }
        else if(u>=400 && u<600)
        {
            U=u*1.80;
        }
        else 
        {
            U=u*2.00;
        }
        if(U>400)
        {
            U+=(((15*U)/100));
        }
        else
        {
            U+=100;
        }
        System.out.printf("%.2f",U);
     }
}