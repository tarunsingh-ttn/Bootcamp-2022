package com.example.springFramework.looseCoupling;


// binary Search class to search an element from a list
public class BinarySearch {
    // for binary search we need a sorted array
    // need a method to sort the array using different algos
    //lets assume we  can sort using two algos , quickSort and bubbleSort
    // we call the sort the method of whichever algo we want to use

   void sortAlgo(){
       System.out.println("tightly coupled sort algo");
   }
    void searchElement(int i) {
        // using new keyword
        // our code is tight coupled if we implement our sorting algorithm class here in the BinarySearch class itself
        // but if create different classes to separate the concern , it would be loose coupled.
        // we can instantiate any sorting algo and call its specific sort method implementation.

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortArray(new int[]{1, 2, 9, 4});

        //logic to search


    }

}
