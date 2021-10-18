package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSortAlgorithm implements SortAlgorithm{

    @Override
    public int[] sort(int[] numbers)
    {
        //bubble sort logic
        System.out.println("Bubble sort implements");
        return numbers;
    }
}
