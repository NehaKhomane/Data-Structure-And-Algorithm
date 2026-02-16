import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void insertionSort(int[] arr,int  N) {
        for (int i = 1; i < N; i++) {
            int  temp=arr[i];
            int j;
            for (j=i-1;j>=0;j--) {
                if(arr[j]>temp) {
                    arr[j+1]=arr[j];
                }
                else {
                    break;
                }

            }
            arr[j+1]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println("Original Array:"+Arrays.toString(arr));
        insertionSort(arr,arr.length);
        System.out.println("Sorted Array" +Arrays.toString(arr));

    }
}