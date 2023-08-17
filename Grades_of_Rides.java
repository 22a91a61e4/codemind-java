import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h,sf,s;
        h=sc.nextInt();
        sf=sc.nextInt();
        s=sc.nextInt();
        if(h>50 && sf>60 && s>100)
        {
            System.out.printf("10");
        }
        else if(h>50 && sf>60)
        {
            System.out.printf("9");
        }
        else if(sf>60 && s>100)
        {
            System.out.printf("8");
        }
        else if(h>50 && s>100)
        {
            System.out.printf("7");
        }
        else if(h>50 || sf>60 || s>100)
        {
            System.out.printf("6");
        }
        else
        {
            System.out.printf("5");
        }
        
    }
}