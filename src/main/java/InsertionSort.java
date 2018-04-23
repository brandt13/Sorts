package main.java;

public class InsertionSort {

    void sort (int arr[]){

        int n = arr.length;

        for (int i = 1; i < n; i++){

            int x = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > x){

                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = x;
        }
    }

    void print(int arr[]){

        System.out.println();
        System.out.print("Sorted array: ");

        for (int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();
        int arr[] = {99, 77, 44, 111, 33, 55, 777, 66, 1, 2};
        is.sort(arr);
        is.print(arr);

    }
}
