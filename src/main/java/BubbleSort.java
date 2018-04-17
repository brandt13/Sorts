package main.java;

public class BubbleSort {

    void sort(int arr[]){

        int n = arr.length;

        for(int i = 0; i < n-1; i++){

            for (int j = 0; j < n-i-1; j++){

                if (arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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

        BubbleSort bs = new BubbleSort();
        int arr[] = {99, 77, 44, 111, 33, 55, 777, 66, 1, 2};
        bs.sort(arr);
        bs.print(arr);

    }
}
