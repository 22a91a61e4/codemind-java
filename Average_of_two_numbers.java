import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a;
        int b,c;
        b=sc.nextInt();
        c=sc.nextInt();
        a=(float)((b+c)/2.0);
        System.out.printf("Average of %d and %d is: %.2f",b,c,a);
    }
}