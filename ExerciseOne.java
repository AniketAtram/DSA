package DSA;

public class ExerciseOne {

    public static void main(String[] args) {
//        numberOfOnes(14);
        countNumberOfOnes(18);
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

    public static void countNumberOfOnes(int num){

        int temp = num; // a temporary variable to store the
        // value of num

        // to store the binary value
        int[] binary = new int[20];

        // to store the count of 1s
        int count = 0;
        int i;

        // to iterate through the loop and keep a
        // count of no.of digits in the obtained binary
        for (i = 0; temp > 0; i++) {

            // divide the number by 2
            // and store the remainder
            temp /= 2;
            binary[i] = temp % 2;

            // If 1 is present in binary
            if (binary[i] == 1)

                // increment the count if any digit
                // is equal to 1
                count++;
        }

        // Printing binary of decimal number
        System.out.print("The binary equivalent of " + num
                + " is : ");

        // Iterating over array
        for (int j = i - 1; j >= 0; j--)

            // Printing obtained array in reverse order
            System.out.print(binary[j]);

        // Printing number of 1's
        System.out.println("\nNumber of 1s is : " + count);
    }
}