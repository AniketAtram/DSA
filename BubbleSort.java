package DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,65,8,90};
        int[] sortedArray = bubbleSort(arr);
        for (Integer i : sortedArray){
            System.out.print(i + " ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        int i, j, temp;
        boolean isSwapped;
        for (i=0;i<arr.length; i++){
            isSwapped = false;
            for (j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
        return arr;
    }
}
