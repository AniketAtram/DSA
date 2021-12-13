package DSA;

public class Palindrome {
    public static void main(String[] args) {
        int input = 1221;
        boolean itIs = isPalindrome(input);
        if (itIs){
            System.out.println(input+" is palindrome");
        }
        else {
            System.out.println(input+" is not a palindrome");
        }
    }
    static boolean isPalindrome(int num){
        int number = num;
        int reverse = 0;

        while (number!=0) {
            reverse = reverse*10+number % 10;
            number = number / 10;
        }

        return reverse==num;
    }
}
