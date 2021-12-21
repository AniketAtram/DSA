package DSA;

public class BinarySearchOccurrences {

    public static void main(String[] args) {
        int[] arr_ = new int[]{1,2,33,33,66,75};
        int size = 6;
        int number = 33;
        System.out.println(frequency(arr_, size, number));
    }

    public static int frequency(int[] arr, int size, int num){

        int i, j;
        // i -> first occurrence
        // j -> second occurrence
        i = first(arr, 0, size-1,num, size);
        // base case
        if (i==-1){
            return i;
        }
        j = last(arr, i, size-1, num, size);

        return j-i+1;
    }

    public static int first(int[] arr, int low, int high, int num, int size){
        if(high >= low)
        {
            /*low + (high - low)/2;*/
            int mid = (low + high)/2;

            if( ( mid == 0 || num > arr[mid-1]) && arr[mid] == num) {
                return mid;
            }
            else if(num > arr[mid]) {
                return first(arr, (mid + 1), high, num, size);
            }
            else {
                return first(arr, low, (mid - 1), num, size);
            }
        }
        return -1;
    }

    public static int last(int[] arr, int low, int high, int num, int size){
        if(high >= low)
        {
            /*low + (high - low)/2;*/
            int mid = (low + high)/2;
            if( ( mid == size-1 || num < arr[mid+1]) && arr[mid] == num )
                return mid;
            else if(num < arr[mid])
                return last(arr, low, (mid -1), num, size);
            else
                return last(arr, (mid + 1), high, num, size);
        }
        return -1;
    }
}