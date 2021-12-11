package DSA;

public class ExerciseOne {

    public static void main(String[] args) {
        numberOfOnes(14);
    }

    public static void numberOfOnes(int decimalNumber) {

        // Integer.toBinaryString converts the decimal number to its binary equivalent
        String binaryEquivalent = Integer.toBinaryString(decimalNumber);

        // Keeping the count of the ones
        int countOfOnes = 0;

        // for loop to see if the character matches the desired condition
        for (int i = 0; i < binaryEquivalent.length(); i++) {

            // if the character matches the desired output, increment the counter
            if (binaryEquivalent.charAt(i) == '1') {

                countOfOnes += 1;
            }
        }
        System.out.println("Th binary equivalent of "+decimalNumber+" is "+ binaryEquivalent);
        System.out.println("Number of 1's in it are : "+countOfOnes);
    }
}