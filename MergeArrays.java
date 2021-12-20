package DSA;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{2,3,5,7,9};
        mergeSortedArrays(array1,array2);

    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for (Integer i:arr1) {
            set.add(i);
        }
        for (Integer j:arr2){
            set.add(j);
        }
        int size = set.size();
        int[] mergedArray = new int[size];
        int x = 0;
        for (Integer element : set){
            mergedArray[x++] = element;
        }
        for (Integer y : mergedArray){
            System.out.print(y+" ");
        }

    }
}
