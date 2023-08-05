import java.util.Scanner;
  
 public class c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double principal,rate, time ;
         principal=sc.nextDouble();
         rate=sc.nextDouble();
         time=sc.nextDouble();
  
        /* Calculate compound interest */
        double CI = principal *
                    (Math.pow((1 + rate / 100), time))-principal;
          
        System.out.printf("%.2f",CI);
    }
}