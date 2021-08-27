import java.util.Scanner;
public class sts1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        int gcd = 1;
        System.out.println("Enter a value: ");
        x = sc.nextInt();
        System.out.println("You have given "+ x);
        System.out.println("Enter another value: ");
        y = sc.nextInt();
        System.out.println("You have given "+ y);

        for(int i = 1;i <=x && i <=y; i++)
        {
            if(x%i==0 && y%i==0)
            {
                gcd = i;
            }

        }
        System.out.println("GCD : " + gcd);

       
    } 


    
}
