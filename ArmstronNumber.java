package DSA;

public class ArmstronNumber {

    public static void main(String[] args) {
        int number = 407;
        int newNumber = number;
        int r;
        int sum =0;

        while (newNumber!=0){
            r = newNumber%10;
            newNumber/=10;
            sum += r*r*r;
        }

        if(sum == number){
            System.out.println("Armstrong!");
        }
        else{
            System.out.println("Not Armstrong!");
        }
    }
}
