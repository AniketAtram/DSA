package DSA;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = new int[]{20,12,10,15,2};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        int i; // number of steps
        int j; // iterator/comparator
        int min; // the minimum value
        // outer loop runs n times for each element inside the array
        for (i=0;i<arr.length;i++){
            min = i;
            for (j=i+1;j<arr.length;j++){
                if (arr[j] > arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (Integer x : arr){
            System.out.print(x + " ");
        }
    }
}
