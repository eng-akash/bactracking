package backtraking;

public class change_in_Array {
    public static void changeArr(int arr[],int i,int val){
//        base case
        if(i==arr.length){
            System.out.print(arr);
            return;
        }
//        method of recursion
        arr[i] = val;
        changeArr(arr,i+1,val+1);
        arr[i] = arr[i]-2;  // backtracking


    }
//    print array
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//    main function
    public static void main(String[] args) {
     int arr[] = new int[5];
     changeArr(arr,0,1);
     printArr(arr);
    }
}
