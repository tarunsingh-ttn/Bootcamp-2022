package com.example.springFramework;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// binary Search class to search an element from a list
@Component
public class BinarySearch {


  @Autowired
  sortAlgo sortingalgo;

    public BinarySearch(sortAlgo sortingalgo) {
        this.sortingalgo = sortingalgo;
    }

    void searchElement(int i) {


    sortingalgo.sortArray(new int[]{5,6});
        System.out.println("number found");
    //logic to sort





    }

}
