package DSA;

public class SelectionSortState {
    public static void main(String[] args) {
        int[] arr = new int[]{7,1,8,3,4};
        int n = 0;

        state(arr, n);

    }
    public static void state(int[] arr, int n){
        int i; // number of steps
        int j; // iterator/comparator
        int min; // the minimum value
        // outer loop runs n times for each element inside the array
        if (n == 0){
            for (Integer x : arr){
                System.out.print(x + " ");
            }
        }
        else {
            for (i = 0; i < n; i++) {
                min = i;
                for (j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            for (Integer x : arr) {
                System.out.print(x + " ");
            }
        }
    }
}
