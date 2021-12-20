package DSA;
// time complexity O(n)
public class FirstNonRepeat {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,1,2};

        System.out.println(firstNonRepeatingElement(array));

    }

    public static int firstNonRepeatingElement(int[] arr){
        int i,j;
        int n = arr.length;
        for (i = 0;i<n;i++){
            for (j=0;j<n;j++){
                if (i!=j && arr[i] == arr[j]){
                    break;
                }
            }
            if (j==n){
                return arr[i];
            }
        }
        return -1;
    }
}
