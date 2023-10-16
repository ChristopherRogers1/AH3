import java.util.Scanner;

public class AH3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to count up to!");

        int input = scan.nextInt();

        for (int i = 1; i <= input; i++)
        {
            if (i%3==0&&i%5==0)
            {
                System.out.print("FizzBuzz ");
            }
            else if (i%5==0)
            {
                System.out.print("Buzz ");
            }
            else if (i%3==0)
            {
                System.out.print("Fizz ");
            }
            else
                System.out.print(i + " ");
        }


    }
}
