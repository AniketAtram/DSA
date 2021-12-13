package DSA;

public class Factorial {

    public static void main(String[] args) {
        int input = 1;
        System.out.println(findFactorial(input));
     }

    static int findFactorial(int num){

        int factorial = num;
        for (int i=num-1;i >= 1; i--){
            factorial *= i;
        }
        return factorial;
    }
}
