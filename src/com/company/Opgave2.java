package com.company;

import java.lang.reflect.Array;

public class Opgave2 {

    /**
     *
     * @param a
     * @param b
     * @return a eller b
     */

    public int method1(int a , int b){

        if (a < b) return a;
        else return b;

    }

    /**
     *
     * @param a
     * @param b
     * @return a eller b
     */

    public int method2(int a, int b){

        if (a > b) return a;
        else return b;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return a, b eller c
     */

    public int method3(int a, int b , int c){

        if(a < b){
            if (b < c) return a;
        }

        if (b < a){
            if (b < c)
                return b;
        }

        return c;

    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return a, b eller c
     */

    public int method4(int a, int b, int c){
        if (a > b){
            if (b > c) return a;
        }

        if (b > a){
            if (b > c) return b;
        }

        return c;

    }

    /**
     *
     * @param arr
     * @return min
     */

    public int arrMin(int[] arr){
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }

        }
        return min;

    }

    /**
     *
     * @param arr
     * @return max
     */

    public int arrMax(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        return max;

    }

    /**
     *
     * @param arr
     * @return sum
     */

    public int arrSum(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;

    }

    /**
     *
     * @param arr
     * @return sum/arr.length
     */

    public double arrAvg(double[] arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] ;

        }

        return sum/arr.length;

    }

}
