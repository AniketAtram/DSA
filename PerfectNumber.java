package DSA;

public class PerfectNumber {
    public static void main(String[] args) {
        int input = 6;
        boolean itiS = isPerfectNumber(input);

        if (itiS){
            System.out.println(input+" is a perfect number");
        }
        else {
            System.out.println(input+" is not a perfect number");
        }
    }
    static boolean isPerfectNumber(int num) {
        int sum = 0;
        if (num == 1){
            return true;
        }
        else {
            for (int i=1; i< num; i++){
                if (num % i == 0){
                    sum+=i;
                }
            }
        }
        return sum==num;
    }
}
