package DSA;

public class SubtractingBits {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        int result;

        result = a +(~b +1);

        System.out.println(result);
    }
}
