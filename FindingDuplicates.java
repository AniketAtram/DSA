package DSA;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicates {

    public static void main(String[] args) {
        int[] inputArray = new int[]{1,1,2,2,2,4};
        findDuplicate(inputArray);

    }

    public static void findDuplicate(int[] arr){

        int i, j;
        int n = arr.length;
        Set<Integer> duplicates = new HashSet<>();
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    duplicates.add(arr[i]);
                    break;
                }
            }
        }
        for (Integer duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
