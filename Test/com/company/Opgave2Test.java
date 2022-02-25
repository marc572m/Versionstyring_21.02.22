package com.company;

import junit.framework.TestCase;
import org.junit.Test;



public class Opgave2Test extends TestCase {

    @Test
    public void testMethod1() {
        Opgave2 opg2 = new Opgave2();
        int res = opg2.method1(1,2);
        int res2 = opg2.method1(3,2);
        int res3 = opg2.method1(1,1);
        assertEquals(1, res);
        assertEquals(2, res2);
        assertEquals(1, res3);
    }

    @Test
    public void testMethod2() {
        Opgave2 opg2 = new Opgave2();
        int res = opg2.method2(5,3);
        int res2 = opg2.method2(6,9);
        int res3 = opg2.method2(3,3);
        assertEquals(5, res);
        assertEquals(9, res2);
        assertEquals(3, res3);
    }

    @Test
    public void testMethod3() {
        Opgave2 opg2 = new Opgave2();
        int res1 = opg2.method3(1,2,3);
        int res2 = opg2.method3(2,1,3);
        int res3 = opg2.method3(3,2,1);
        int res4 = opg2.method3(1,1,1);
        assertEquals(1, res1);
        assertEquals(1,res2);
        assertEquals(1,res3);
        assertEquals(1,res4);
    }

    @Test
    public void testMethod4() {
        Opgave2 opg2 = new Opgave2();
        int res1 = opg2.method4(1,2,3);
        int res2 = opg2.method4(2,1,3);
        int res3 = opg2.method4(3,2,1);
        int res4 = opg2.method4(1,1,1);
        assertEquals(3, res1);
        assertEquals(3,res2);
        assertEquals(3,res3);
        assertEquals(1,res4);
    }


    @Test
    public void testArrMin() {
        Opgave2 opg2 = new Opgave2();
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {9,3,4,5};
        int[] arr3 = {8,3,2,6};
        int res1 = opg2.arrMin(arr1);
        int res2 = opg2.arrMin(arr2);
        int res3 = opg2.arrMin(arr3);
        assertEquals(1,res1);
        assertEquals(3,res2);
        assertEquals(2,res3);
    }

    @Test
    public void testarrMax() {
        Opgave2 opg2 = new Opgave2();
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {9,3,4,5};
        int[] arr3 = {8,3,2,6};
        int res1 = opg2.arrMax(arr1);
        int res2 = opg2.arrMax(arr2);
        int res3 = opg2.arrMax(arr3);
        assertEquals(4,res1);
        assertEquals(9,res2);
        assertEquals(8,res3);
    }

    @Test
    public void testarrSum() {
        Opgave2 opg2 = new Opgave2();
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {9,3,4,5};
        int[] arr3 = {8,3,2,6};
        int res1 = opg2.arrSum(arr1);
        int res2 = opg2.arrSum(arr2);
        int res3 = opg2.arrSum(arr3);
        assertEquals(10,res1);
        assertEquals(21,res2);
        assertEquals(19,res3);

    }

    @Test
    public void testarrAvg() {
        Opgave2 opg2 = new Opgave2();
        double[] arr1 = {1,2,3,4};
        double[] arr2 = {9,3,4,5};
        double[] arr3 = {8,3,2,6};
        double res1 = opg2.arrAvg(arr1);
        double res2 = opg2.arrAvg(arr2);
        double res3 = opg2.arrAvg(arr3);
        assertEquals(2.5,res1);
        assertEquals(5.25,res2);
        assertEquals(4.75,res3);
    }
}