package com.techupstudio;

import static com.techupstudio.LinearSearchAlgorithm.*;

public class Main {

    public static void main(String[] args) {

        int index = linearSearchRecursive(new int[]{1,2,3,4,5,6,7,8,9}, 0 , 9);
        System.out.println(index);

        index = linearSearch(new int[]{1,2,3,4,5,6,7,8,9}, 4);
        System.out.println(index);

        int arr[] = minMaxRecursive(new int[]{1,2,3,4,5,6,7,8,9}, 0, 0, 0);
        System.out.println("min: "+arr[0]);
        System.out.println("max: "+arr[1]);

        arr = minMax(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println("min: "+arr[0]);
        System.out.println("max: "+arr[1]);
    }

}
