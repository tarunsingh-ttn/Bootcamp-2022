package com.example.springFramework;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSort implements sortAlgo{

    @Override
    public int[] sortArray(int[] arrayToBeSorted) {
        System.out.println("using bubble sort implementation");
        return new int[0];
    }
}
