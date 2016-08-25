package edu.eulerproject.task1;

/**
 * Created by VYA on 25.08.2016.
 */
public class Number {

    public void addition() {
        long sum = 0;


        for (int i = 1; i<1000; i++) {
            if(i % 3 == 0 || i % 5 == 0)
                sum = sum + i;

        }
        System.out.println("sum = " + sum);


    }
}
