package DSA;

import java.util.Arrays;

public class AlternateSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,1,4,2,9,3};
        alternateSort(arr);
    }
    public static void alternateSort(int[] arr){
        int len = arr.length;
        int i,j;

        // sort the array
        Arrays.sort(arr);

        // create a temporary array to hold the data
        int[] tempArr = new int[len];

        // Initialize array index for temp array element addition
        int idx = 0;

        // run a loop to go from left to right and place each element in desired order
        for (i=len-1,j=0;i>len/2 || j<=len/2;i--,j++){
            if (idx < len){
                tempArr[idx] = arr[i];
                idx += 1;
            }
            if (idx < len){
                tempArr[idx] = arr[j];
                idx += 1;
            }
        }

        // Replace the original array with modded array
        for (i=0;i<len;i++){
            arr[i] = tempArr[i];
        }

        // Print the elements
        for (Integer x : arr){
            System.out.print(x+" ");
        }
    }
}