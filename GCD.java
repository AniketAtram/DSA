package DSA;

public class GCD {

    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 36;
        int gcd = findGCDAndLCM(n1, n2);
        int lcm  = (n1*n2)/gcd;
        System.out.println("GCD of "+n1+" & "+n2+" is "+gcd);
        System.out.println("LCM of "+n1+" & "+n2+" is "+lcm);

    }

    static int findGCDAndLCM(int num1, int num2){
        int gcd;
        int product = num1*num2;
        while (num1!=num2){
            if (num1>num2){
                num1 = num1-num2;
            }
            else {
                num2 = num2-num1;
            }
        }
        gcd = num2;
        return gcd;
    }
}
