package DSA;

public class RecursionSum {

    public static void main(String... args){
        int sum = sumOfIntegers(492);

        System.out.println(sum);
    }

    public static  int sumOfIntegers(int n){
        if (n==0){
            return 0;
        }
        int sum = n%10 + sumOfIntegers(n / 10);
        return sum;
    }
}
