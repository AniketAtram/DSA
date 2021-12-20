package DSA;
// time complexity O(n)
public class FirstNonRepeat {

    public static void main(String[] args) {
        int size = 5;
        int[] array = new int[]{1,2,3,4,1};

        System.out.println(firstNonRepeatingElement(size, array));

    }

    public static int firstNonRepeatingElement(int n, int[] arr){
        int i,j;
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
