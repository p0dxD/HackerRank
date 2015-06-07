
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class CutTheSticks {

    static int[] sticks;
    static int[] sortedArray;
    static int numberOfSticks = 0;
    static boolean hasSticks = true;
    static int biggest;
    static int N;//number of sticks we have at initial

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        sticks = new int[N];
        for (int i = 0; i < sticks.length; i++) {
            sticks[i] = input.nextInt();
        }
        sortedArray = sort(sticks);
        biggest = sortedArray[sortedArray.length-1];
        while (stillHasSticks(sortedArray)) {
            System.out.println(countAndCut(sortedArray));
        }

    }

    /**
     * if all the spots on the array don't have 0 then it still has
     *
     * @return true if it has else false
     */
    private static boolean stillHasSticks(int[] sortedArray) {
        int count = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] > 0) {
                count++;
            }
        }
        hasSticks = count > 0;
        return hasSticks;
    }

    /**
     * Does the cutting and counts to how many it did it to
     *
     * @param sortedArray the sorted array we want to cut
     * @return the cut numbers
     */
    private static int countAndCut(int[] sortedArray) {
        numberOfSticks = 0;
        int smallest = getSmallest(sortedArray);
//        System.out.println(smallest);
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] > 0) {
                sortedArray[i] -= smallest;
                numberOfSticks++;
            }
        }
        return numberOfSticks;
    }
    /**
     * Gets the smallest value available in the array
     * @param sortedArray the array that is sorted
     * @return the smallest value
     */
    private static int getSmallest(int[] sortedArray) {
        int smallest = biggest;//hard coded value, can be set to biggest in sorted[initial]
        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] < smallest && sortedArray[i] != 0) {
                smallest = sortedArray[i];
            }
        }
        return smallest;
    }

    /**
     * Sorts the array least to high
     *
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
     *
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
