package com.example.springFramework;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements sortAlgo {

    @Override
    public int[] sortArray(int[] arrayToBeSorted) {
        System.out.println("using quicksort implementation");
        return new int[0];
    }
}
