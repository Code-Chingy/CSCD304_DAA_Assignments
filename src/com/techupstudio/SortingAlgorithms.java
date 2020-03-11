package com.techupstudio;

public class SortingAlgorithms {

    public static void bubbleSort(int [] arr){
         for (int i=0;i<arr.length;i++){
             for (int j=0;j<arr.length;j++){
                 if (arr[i] < arr[j]){
                     int temp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = temp;
                 }
             }
         }
    }

    public static void selectionSort(int [] arr){
         for (int i=0;i<arr.length-1;i++){
             int index = i;
             for (int j=index+1;j<arr.length;j++){
                 if (arr[j] < arr[index]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                     break;
                 }
             }
         }
    }



    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
