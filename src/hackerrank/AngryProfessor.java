package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class AngryProfessor {
    private static int N;//number of students
    private static int K;//number of students necessary at least
    private static int T;//number of test cases
    private static int numberOfStudentsOnTime = 0;//starting number
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        N = input.nextInt();
        while(T>0){
        K = input.nextInt();
        numberOfStudentsOnTime = 0;
        for(int i = 0; i < N; i++){
            if(input.nextInt()<=0){
                numberOfStudentsOnTime++;
            }
        }
        if(numberOfStudentsOnTime==K){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        T--;
    }
    }
}
