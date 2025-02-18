package ru.ifellow.JSchool.introdution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom);
    }

    public int sum(int[] array) {
        int sumarray = 0;
        for (int i = 0; i < array.length; i++) {
            sumarray += array[i];
        }
        return sumarray;
    }

    public int mul(int[] array) {
        int proizvedenie = 0;
        if (array.length > 0) {
            proizvedenie = 1;
            for (int i = 0; i < array.length; i++) {
                proizvedenie *= array[i];
            }
        }
        return proizvedenie;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array) {
        int middle = 0;
        if (array.length > 0) {
            middle = sum(array)/array.length;
        }
        return middle;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                if (array[i + 1] > array[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
        return;
    }

    public boolean find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        int cup;
        for (int i = 0, iend = array.length - 1; i < iend; i++, iend--) {
            cup = array[i];
            array[i] = array[iend];
            array[iend] = cup;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array.length >1) {
            for (int i = 0, iend = array.length - 1; i < iend; i++, iend--) {
                if (array[i] != array[iend]) {
                    return false;
                }
            }
        }
        return true;
    }


    public int sum(int[][] matrix){
        int summatrix = 0;
        for (int i = 0; i < matrix.length; i++){
            summatrix += sum(matrix[i]);
        }
        return summatrix;
    }

    public int max(int[][] matrix){
        int temp;
        int maxmatrix = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            temp = max(matrix[i]);
            if (temp > maxmatrix){
                maxmatrix = temp;
            }
        }
        return maxmatrix;
    }

    public int diagonalMax(int[][] matrix){
        int temp2;
        int diagonalmax = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++){
            temp2 = matrix[i][i];
            if (temp2 > diagonalmax){
                diagonalmax = temp2;
            }
        }
        return diagonalmax;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if (!isSortedDescendant(matrix[i])){
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        int x = 10;
//        int y = 10;
//        System.out.println(x + y); // 1
//        System.out.println(x * y); // 2
//        System.out.println(x / y); // 3
//        System.out.println(x % y); // 4
//        System.out.println(x == y); // 5
//        System.out.println(x > y); // 6
//        // 7
//        int xLeft = 3, yTop = 3;
//        int xRight = xLeft + 7, yBottom = yTop + 7;
//        System.out.println(xLeft);
//        System.out.println(xRight);
//        System.out.println(yTop);
//        System.out.println(yBottom);
//        System.out.println(x >= xLeft && x <= xRight && y >= yTop && y <= yBottom);
//        if (x >= xLeft && x <= xRight && y >= yTop && y <= yBottom) {
//            //then return true
//            System.out.println(true);
//        } else System.out.println(false);
//        // 8
//        int array[] = {1, 2, 3, 4, 5};
//        int sumarray = 0;
//        // 8.1
//        for (int i = 0; i < array.length; i++) {
//            sumarray += array[i];
//        }
//        System.out.println(sumarray);
//        // 8.2
//        System.out.println(Arrays.stream(array).sum());
//        // 8.3
//        System.out.println(IntStream.of(array).sum());
//        // 9
//        int proizvedenie = 0;
//        if (array.length > 0) {
//            proizvedenie = 1;
//            for (int i = 0; i < array.length; i++) {
//                proizvedenie *= array[i];
//            }
//        }
//        System.out.println(proizvedenie);
//        // 10
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println(min);
//
//        System.out.println("10_________10");
//        // 11
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//        // 12
//        int middle = 0;
//        if (array.length > 0) {
//            for (int i = 0; i < array.length; i++) {
//                middle += array[i];
//            }
//            middle = middle / array.length;
//        }
//        // 12.2
//        FirstSteps myObject = new FirstSteps();
//        middle = myObject.sum(array)/array.length;
//        System.out.println("12: Среднее значение: " + middle);
//        // 13
//        for (int i = 0; i < array.length; i++) {
//            if (i + 1 < array.length) {
//                if (array[i + 1] > array[i]) {
//                    System.out.println(false);
//                }
//            }
//        }
//        System.out.println(true);
//        // 14
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] * array[i] * array[i];
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("14_________14");
//        // 15
//        int value = 8;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                System.out.println(true);
//            }
//        }
//        System.out.println(false);
//        // 16
//        int cup;
//        for (int i = 0, iend = array.length - 1; i < iend; i++, iend--) {
//            cup = array[i];
//            array[i] = array[iend];
//            array[iend] = cup;
//        }
//        System.out.println(Arrays.toString(array));
//        // 17
//        if (array.length >1) {
//            for (int i = 0, iend = array.length - 1; i < iend; i++, iend--) {
//                if (array[i] != array[iend]) {
//                    System.out.println(false);
//                }
//            }
//        }
//        System.out.println(true);
//        // 18
//        int summatrix = 0;
//        int matrix[][] = {{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
//        for (int i = 0; i < matrix.length; i++) {
//            summatrix += myObject.sum(matrix[i]);
//        }
//        System.out.println(summatrix);
//        // 19
//        int temp;
//        int maxmatrix = Integer.MIN_VALUE;
//        for (int i = 0; i < matrix.length; i++) {
//            temp = myObject.max(matrix[i]);
//            if (temp > maxmatrix){
//                maxmatrix = temp;
//            }
//        }
//        System.out.println(maxmatrix);
//        // 20
//        int temp2;
//        int diagonalmax = Integer.MIN_VALUE;
//        for (int i = 0; i < matrix.length; i++) {
//            temp2 = matrix[i][i];
//            if (temp2 > diagonalmax){
//                diagonalmax = temp2;
//            }
//        }
//        System.out.println(diagonalmax);
//        System.out.println("20 end ______________ 20 end");
//        // 21
//        for (int i = 0; i < matrix.length; i++) {
//            if (!myObject.isSortedDescendant(matrix[i])){
//                System.out.println(false);
//            }
//        }
//        System.out.println(true);
//    }

}
