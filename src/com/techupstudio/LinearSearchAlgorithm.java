package com.techupstudio;

public class LinearSearchAlgorithm {

    private LinearSearchAlgorithm(){}

    public static int linearSearchRecursive(int[] arr, int current_index, int key){
        if (current_index < arr.length)
            if  (arr[current_index] == key)
                return current_index;
            else
                return linearSearchRecursive(arr, ++current_index, key);
        else
            return -1;
    }

    public static int linearSearch(int[] arr, int key){
        for (int i=0;i<arr.length;i++)
            if (arr[i] == key)
                return i;

        return -1;
    }

    public static int[] minMaxRecursive(int[] arr, int min, int max, int index){

        if (arr.length < 2)
            return null;

        if (index == 0)
            min = max = arr[0];

        if (index < arr.length) {
            if (arr[index] > max)
                max = arr[index];
            else if (arr[index] < min)
                min = arr[index];
            return minMaxRecursive(arr, min, max, ++index);
        }
        else {
            return new int[]{min, max};
        }
    }

    public static int[] minMax(int[] arr){

        if (arr.length < 2)
            return null;

        int _minMax[] = new int[]{arr[0], arr[1]};

        for (int i=0;i<arr.length;i++)
            if (arr[i] > _minMax[1])
                _minMax[1] = arr[i];
            else if (arr[i] < _minMax[0])
                _minMax[0] = arr[i];

        return _minMax;
    }


}
