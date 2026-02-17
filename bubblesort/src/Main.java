import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  void bubbleSort(int[] arr,int N){
        int passes=0,comps=0;
        //N= no of elements
        for(int i=1;i<N;i++){
            passes++;
            for(int j=0;j<N-i;j++){
                comps++;
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("No of passes = "+passes);
        System.out.println("No of comps = "+comps);
    }
    public static void improveSort(int[] arr,int N){
        int passes=0,comps=0,flag;
        for(int i=1;i<N;i++){
            passes++;
            flag=0;
            for(int j=0;j<N-i;j++){
                comps++;
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
        System.out.println("No of passes : " + passes);
        System.out.println("No of comps : " + comps);
    }
    public static void main(String[] args) {
       // int arr[]={33,22,66,55,44,11};
        int arr[]={11,22,33,44,55,66};
        System.out.println("Array Before Sort:" +Arrays.toString(arr));
       //bubbleSort(arr,arr.length);
        improveSort(arr,arr.length);
       // Arrays.sort(arr);
        System.out.println("Array After Sort:" +Arrays.toString(arr));

    }
}