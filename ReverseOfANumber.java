package DSA;

public class ReverseOfANumber {

    public static void main(String[] args) {

        int number = 001;
        System.out.println("Number -> "+number);
        int reverse = 0;

        while (number!=0) {
            reverse = reverse*10+number % 10;
            number = number / 10;
        }

        System.out.println("Reverse of number -> "+reverse);

    }
}
