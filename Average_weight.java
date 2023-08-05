import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,x;
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=3*x-(a+b);
        System.out.printf("%d",c);
    }
}