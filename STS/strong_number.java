import java.util.Scanner;
public class strong_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num%10 != 0)
        {
            int rem = num%10;
            int i,fact = 1;
            for(i=1;i<rem+1;i++)
            {
                fact = fact*i;
                
            }
            sum = sum + fact;

            num = num/10;
        }

        // System.out.println(sum);
        // System.out.println(num);

        if(sum == temp)
        {
            System.out.println("Hurray!!! It's a strong number");
        }
        else
        {
            System.out.println("No, Sorry its not a strong number!!");
        }
    } 


    
}
