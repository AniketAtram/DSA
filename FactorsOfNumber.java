package DSA;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int input = 24;
        factors(input);
    }

    static void factors(int num){
        for (int i=1;i<num;i++){
            if (num%i==0){
                System.out.println(i+" is a factor of "+num);
            }
        }
    }
}
