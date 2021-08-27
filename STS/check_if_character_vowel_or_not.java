import java.util.Scanner;
public class check_if_character_vowel_or_not {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String c = sc.next();

        if((c.equals("a")) || (c.equals("A")))
        {
            System.out.println("It is vowel!!");
        }
        else if((c.equals("e")) || (c.equals("E")))
        {
            System.out.println("It is vowel!!");
        }
        else if((c.equals("i")) || (c.equals("I")))
        {
            System.out.println("It is vowel!!");
        }
        else if((c.equals("o")) || (c.equals("O")))
        {
            System.out.println("It is vowel!!");
        }
        else if((c.equals("u")) || (c.equals("U")) )
        {
            System.out.println("It is vowel!!");
        }
        else{
            System.out.println("It is Consonants!!");
        }
    } 


    
}
