package edu.eulerproject.tasks;

/**
 * Created by VYA on 01.09.2016.
 * Problem 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class Problem2 {
    public static void main(String[] args) {
        int a_2 = 1;
        int a_1 = 2;
        int a = 3;
        int sum = 2;
        int tmp = 0;
        while (a <= 4000000) {
            if(a%2 == 0)
                sum += a;
            a += a_1;
            tmp = a_1;
            a_1 += a_2;
            a_2 = tmp;
        }
        System.out.println("sum = "+sum);
    }
}
