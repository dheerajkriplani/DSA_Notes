package Sorting;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = {5, 10, 2, 77, 53, 20};
        int n = arr.length;
        sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int pivot=partition(arr,s,e);
        sort(arr,s,pivot-1);
        sort(arr,pivot+1,e);
    }
    public static int partition(int arr[],int s,int e){
        int id=s-1;
        int pivot=arr[e];
        for(int i=s;i<e;i++){
            if(arr[i]<pivot){
                id++;
                int temp=arr[id];
                arr[id]=arr[i];
                arr[i]=temp;
            }
        }
        id++;
        int temp=arr[id];
        arr[id]=pivot;
        arr[e]=temp;
        return id;
    }
}
