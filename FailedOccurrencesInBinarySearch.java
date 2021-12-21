package DSA;

public class FailedOccurrencesInBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,8};
        int key = 8;

        System.out.println(failedOccurrencesBinary(arr, key));
    }

    public static int failedOccurrencesBinary(int[] inputArr, int key){
        int low, high, counter;
        counter=0;
        low = inputArr[0];
        high = inputArr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (inputArr[mid] == key) {
                return mid;
            }

            if (inputArr[mid] < key) {
                low = mid + 1;
                counter += 1;
            }

            else{
                high = mid - 1;
            }

        }

        return counter;
    }
}
