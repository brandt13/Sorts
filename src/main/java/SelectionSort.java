package main.java;

public class SelectionSort {

    public static void main(String[] args) {

        SelectionSort ob = new SelectionSort();
        int arr[] = {100, 80, 75, 60, 48, 22, 43, 88, 99, 23};
        ob.sort(arr);
        System.out.println();
        System.out.print("Sorted array: ");
        ob.printArray(arr);
    }

    void sort(int arr[]){

        int x = arr.length;

        for (int i = 0; i < x-1; i++){

            int min = i;

            for (int j = i+1; j < x; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    void printArray(int arr[]){

        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
