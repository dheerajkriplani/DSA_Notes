package Recursion;

public class ___QuickSort {
    public static void main(String[] args) {
        int arr[] = {7, 6, 9, 4, 11, 2, 5};
        quick_sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quick_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivot = partition(arr, si, ei);
        quick_sort(arr, si, pivot - 1);
        quick_sort(arr, pivot + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
