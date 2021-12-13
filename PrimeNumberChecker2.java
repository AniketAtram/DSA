package DSA;

// time complexity for this method is O(n)
// since the loop will check for n/2 times
public class PrimeNumberChecker2 {

    public static void main(String[] args) {

        boolean flag = true;
        int i, n;

        n = 7;

        for (i=2;i<= n/2;++i){
            if (n % i == 0){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(n+" is a prime number");
        }
        else {
            System.out.println(n+" is not a prime number");
        }
    }
}
