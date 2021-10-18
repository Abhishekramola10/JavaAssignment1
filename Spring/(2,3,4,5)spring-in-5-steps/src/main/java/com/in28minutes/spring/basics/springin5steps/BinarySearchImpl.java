package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {      //Binary Search Depends on Sort_Algorithm
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int number_to_search_for) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println("Binary Search is running");

        //search the array
        return 3;
    }
}


