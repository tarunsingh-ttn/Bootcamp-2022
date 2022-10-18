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


        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortArray(new int[]{1, 2, 9, 4});

        //logic to search


    }

}
