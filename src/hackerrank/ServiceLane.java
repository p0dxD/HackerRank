/*
Input Format

The first line of input contains two integers, N and T, 
where N denotes the length of the freeway and T the number 
of test cases. The next line has N space-separated integers 
which represent the width array.

T test cases follow. Each test case contains two integers, 
i and j, where i is the index of the segment through which 
Calvin enters the service lane and j is the index of the lane 
segment through which he exits.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Jose
 * 
 **/
public class ServiceLane {
        static int N; //length of the freeway
        static int T; //number of test cases
        static int min; //this is what we try to find in each case
        static int serviceLane[];
        static int answers[];//we will store the answers here for convenience 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        T = input.nextInt();
//        System.out.println("N: " +N+ "\nT: "+T);
        serviceLane = new int[N];
        answers = new int[T];
        for(int i = 0; i < serviceLane.length;i++){
            serviceLane[i] = input.nextInt();
        }
        for(int i = 0; i < T; i++){
           answers[i] = checkArray(input.nextInt(),input.nextInt());
        }
        for(int i = 0; i < answers.length; i++){
            System.out.println(answers[i]);
        }
        input.close();
    }
    /**
     * This will find the min
     * @param i start of lane
     * @param j end of lane
     * @return the min that can pass
     */
    private static int checkArray(int i, int j){
        min = 3;//the max is 3 for car, bike, truck
        for(int initial = i; initial <= j; initial++){
            if(serviceLane[initial]< min){
                min = serviceLane[initial];
            }
        }
        return min;
    }
}
