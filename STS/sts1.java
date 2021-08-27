import java.util.Scanner;
public class sts1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*int x,y;
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

        System.out.println("GCD : " + gcd); */

        // System.out.println("Enter a character: ");
        // String c = sc.next();

        // if((c.equals("a")) || (c.equals("A")))
        // {
        //     System.out.println("It is vowel!!");
        // }
        // else if((c.equals("e")) || (c.equals("E")))
        // {
        //     System.out.println("It is vowel!!");
        // }
        // else if((c.equals("i")) || (c.equals("I")))
        // {
        //     System.out.println("It is vowel!!");
        // }
        // else if((c.equals("o")) || (c.equals("O")))
        // {
        //     System.out.println("It is vowel!!");
        // }
        // else if((c.equals("u")) || (c.equals("U")) )
        // {
        //     System.out.println("It is vowel!!");
        // }
        // else{
        //     System.out.println("It is Consonants!!");
        // }

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
