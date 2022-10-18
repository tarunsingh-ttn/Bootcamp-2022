package com.example.springFramework.tightCouplingExample;

public class BinarySearch {
    int[] numbers={5,6,84,3,8,9};
    int search(int element){
        //logic to sort

            int n = numbers.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(numbers[j-1] > numbers[j]){
                        //swap elements
                        temp = numbers[j-1];
                        numbers[j-1] = numbers[j];
                        numbers[j] = temp;
                    }

                }
            }



        //logic to search

    int i=0,j=numbers.length;

        while(i<=j)
    {
        int mid=(i+j)/2;
        if(numbers[mid]==element)
            return mid;
        else  if(numbers[mid]<element)
        {
            i=mid+1;
        }
        else
        {
            j=mid-1;
        }

    }

    return -1;
    }

    public static void main(String[] args) {
        System.out.println(new BinarySearch().search(3));;
    }
}
