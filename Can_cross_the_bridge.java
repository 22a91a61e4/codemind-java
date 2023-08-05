import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int x,y,z,a;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=(z-y)/x;
        System.out.printf("%d",a);
    }
}