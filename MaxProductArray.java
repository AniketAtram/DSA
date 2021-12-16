package DSA;

import java.util.Arrays;

public class MaxProductArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,3,14,6};
        int max_product = max(arr);
        System.out.print("The input array is [ ");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Max product is :"+max_product);
    }

    public static int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1] * arr[arr.length-2];

    }
}
