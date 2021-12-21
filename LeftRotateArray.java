package DSA;

public class LeftRotateArray {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int pos = 3;

        rotate(arr,n,pos);

    }
    public static void rotate(int[] arr, int n, int d){
        int i,j,first;
        for (i=0;i<d;i++){
           first = arr[0];
           for (j=0;j<n-1;j++){
               arr[j] = arr[j+1];
           }
           arr[j] = first;
        }
        for (Integer x : arr){
           System.out.print(x+" ");
        }
     }
}
