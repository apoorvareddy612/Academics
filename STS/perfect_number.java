import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number to check if it is perfect number: ");
        int num = sc.nextInt();

        for(int i = 1;i<num;i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
        {
            System.out.println("The number is perfect number");
        }
        else
        {
            System.out.println("THe number is not perfect number");
        }

    }

}
