package DSA;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(5);

    }

    static void fibonacci(int number){
        int next, first=0, second=1;

        while (first<=number-1){
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
