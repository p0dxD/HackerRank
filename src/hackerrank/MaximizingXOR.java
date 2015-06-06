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
public class MaximizingXOR {
    static int L,R,xor = 0, max = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        L = input.nextInt();
        R = input.nextInt();
        for(int i  = L; i <= R; i++){
            for(int j = L; j <= i;j++){
                xor=i^j;
                if(xor>max)
                    max=xor;
                
            }
        }
            System.out.println("max: " + max);
    }
}
