package DSA;
import java.util.Scanner;
public class RecursionFactorial {

    public static void main(String... args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int fact = factorial(number);
        System.out.println("Factorial of "+number+" is : "+fact);
    }

    public static int factorial(int n){
        // base
        if (n == 0){
            return 1;
        }

        // recursion
        return n*factorial(n-1);
    }
}
