package DSA;

public class FailedOccurrencesLinearSearch {

    public static void main(String[] args) {
        int[] input = new int[]{2,3,4,5,8};
        int key = 8;
        System.out.println(failedOccurrencesLinear(input, key));
    }

    public static int failedOccurrencesLinear(int[] inputArr, int key){
        int attempts = 0;
        for (int j : inputArr) {
            if (j == key) {
                break;
            } else {
                attempts += 1;
            }
        }
        return attempts;
    }
}
