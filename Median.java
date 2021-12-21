package DSA;

public class Median {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,1,2,2,3,3,4,4};
        int median = median(inputArray);
        System.out.println("Median is: "+median);
    }
    public static int median(int[] arr){
        int len,mid, medi;
        len = arr.length;
        mid = len/2;
        // print the original array
//        System.out.print("Input array: ");
//        for (Integer i : arr){
//            System.out.print(i+" ");
//        }
//        System.out.println("\nThe length of array is: "+len);
        if (len%2 !=0){
            medi = arr[mid];
//            System.out.print("The median is: "+medi);
        }
        else {
            medi = (arr[mid] + arr[mid-1])/2;
//            System.out.print("Median is: "+medi);
        }
        return medi;
    }
}
