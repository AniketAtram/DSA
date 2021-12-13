package DSA;

// Time complexity of this method is sqrt(n)
public class PrimeNumberChecker {

    public static void main(String[] args) {
        int inputNumber = 23;

        if (isPrime(inputNumber)){
            System.out.println(inputNumber+" is a prime number");
        }
        else {
            System.out.println(inputNumber+" is not a prime number");
        }

    }

    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        else if (n == 2){
            return true;
        }
        else if (n % 2 == 0){
            return false;
        }
        else {
            for (int i = 3; i <= (n * 0.5); i += 2) {
                if (n % i == 0) {

                    return false;
                }
            }
            return true;
        }
    }
}
