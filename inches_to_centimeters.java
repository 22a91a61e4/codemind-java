import java.util.Scanner;
public class cdmp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double h;
        int in;
        in=sc.nextInt();
        h=in*2.54;
        System.out.printf("%.2f",h);
    }
}