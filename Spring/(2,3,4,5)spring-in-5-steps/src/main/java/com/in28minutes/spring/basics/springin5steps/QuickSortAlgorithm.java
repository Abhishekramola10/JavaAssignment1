package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component      //Question 3
@Primary        //Question 5: To remove ambiguity
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbers)
    {
        //Quick sort logic
        System.out.println("Quick sort implements");
        return numbers;
    }
}
