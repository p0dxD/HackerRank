
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class LoveLetter {

    private static boolean isPalindrome;//if  otherwise is not
    private static int changesNeededToBePalindrome = 0;//# of changes
    private static int T;//number of words

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        for(int i = 0; i < T; i++){
        word = input.next();//get the next word
        if (isPalindrome(word)) {
            System.out.println("0");
        
        } else {
            System.out.println(changesToMakePalindrome(word));
        }
        changesNeededToBePalindrome = 0;
        }
    }
    /**
     * returns an int with the amount of changes a word should perform
     * @param word 
     * @return amount of changes
     */
    private static int changesToMakePalindrome(String word) {
        String firstHalf;
        String secondHalf;
        firstHalf = word.substring(0, word.length() / 2);
        if (word.length() % 2 == 0) {
            secondHalf = word.substring(word.length() / 2, word.length());
        } else {
            secondHalf = word.substring(word.length() / 2 + 1, word.length());
        }
        secondHalf = reverseString(secondHalf);
        for (int i = 0; i < firstHalf.length(); i++) {
            changesNeededToBePalindrome += Math.abs((firstHalf.charAt(i))
                    - (secondHalf.charAt(i)));
        }
        return changesNeededToBePalindrome;
    }

    /**
     * Boolean to return if its a palindrome or not
     *
     * @param word that we want to check
     * @return true if it is otherwise false
     */
    private static boolean isPalindrome(String word) {
        String firstHalf;
        String secondHalf;
        firstHalf = word.substring(0, word.length() / 2);
        if (word.length() % 2 == 0) {
            secondHalf = word.substring(word.length() / 2, word.length());
        } else {
            secondHalf = word.substring(word.length() / 2 + 1, word.length());
        }
        isPalindrome = firstHalf.equals(reverseString(secondHalf));

        return isPalindrome;
    }

    /**
     * Reverses the given string
     *
     * @param word to reverse
     * @return the reversed word
     */
    private static String reverseString(String word) {
        char[] sequence = word.toCharArray();
        char temp;
        int start = 0;
        int end = sequence.length - 1;
        while (end > start) {
            temp = sequence[end];
            sequence[end] = sequence[start];
            sequence[start] = temp;
            start++;
            end--;
        }
        return new String(sequence);
    }
}
