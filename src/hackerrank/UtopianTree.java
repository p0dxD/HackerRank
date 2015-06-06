/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class UtopianTree {

    static int T;//number of test cases
    static int N[];//number of cyles for that test case
    static int height = 1;//initial height

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        N = new int[T];
        for (int i = 0; i < T; i++) {
            N[i] = input.nextInt();
        }
//            System.out.println(N[0]);
//            System.out.println(N[1]);
        int number = 0;
        for (int i = 0; i < T; i++) {
                height =1;
            number = N[i];
//            System.out.println(number);
            if (number == 0) {
                System.out.println(1);

            } else {
                for (int j = 0; j < number; j++) {
//                    System.out.println(j);
                    if(height%2==0){
                        height++;
                    }else{
                        height*=2;
                    }
                }
            }
                    System.out.println(height);
        }
    }
}
