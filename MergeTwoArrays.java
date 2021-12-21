package DSA;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] first = new int[]{};
        int[] second = new int[]{1,2,3};
        int[] merged = merge(first, second);
        // print the merged array
        for (Integer x : merged){
            System.out.print(x+" ");
        }
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int l1, l2, i, j;
        l1 = arr1.length; // length of first array
        l2 = arr2.length; // length of second array
        int[] mergedArray = new int[l1+l2]; // resultant merged array
        // loop for reading and inserting elements from first array
        for (i=0;i<l1;i++){
            mergedArray[i] = arr1[i];
        }
        // loop for reading and inserting elements from second array
        for (j=l1;j<mergedArray.length;j++){
            mergedArray[j] = arr2[j-l1];
        }
        return mergedArray;
    }
}