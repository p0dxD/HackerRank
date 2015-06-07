/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;

/**
 *
 * @author Joseph
 */
public class CutTheSticks {

    static int[] sticks = {1, 2, 3, 4, 5};
    static int[] sortedArray;

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(Arrays.toString(sticks));
        
        sortedArray = sort(sticks);
        System.out.print(Arrays.toString(sortedArray));
    }
    /**
     * Sorts the array least to high
     * @param array array to sort
     * @return the sorted array
     */
    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {//bubble sort slow O(n^2)
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }
    /**
     * Swaps two values
     * @param array with the values
     * @param loc1 location of first int
     * @param loc2 location of second int
     */
    private static void swap(int[] array, int loc1, int loc2) {
        int temp = array[loc1];
        array[loc1] = array[loc2];
        array[loc2] = temp;

    }
}
