package secondexs;

import java.util.Scanner;
import java.util.Stack;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int input = scanner.nextInt();
        while(input != -99){
            stack.add(input);
            input = scanner.nextInt();
        }
        int sum = 0;
        double avg;
        int greaterThanAvg = 0;
        for(int i: stack) sum += i;
        avg = (double) sum / stack.size();
        System.out.println("The number of values in the stack is " + stack.size());
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("The values are: ");
        for(int i: stack){
            if (i > avg) {
                greaterThanAvg++;
                System.out.println(i + " Which is greater than the average.");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("The amount of values greater than the average is: " + greaterThanAvg);

    }
}
