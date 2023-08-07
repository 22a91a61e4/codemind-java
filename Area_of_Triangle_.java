import java.util.Scanner;
public class d{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,ar;
         a=sc.nextInt();
          b=sc.nextInt();
           c=sc.nextInt();
           s=(double)(a+b+c)/2;
           ar=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
           System.out.printf("%.2f",ar);
    }
    
}