package firstexs;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program shows the first 'n' multiples of 'm'");
        System.out.println("Insert the number of iterations (n): ");
        try{
            int n = scanner.nextInt();
            System.out.println("Insert the base number for iterations to be multiple of (m): ");
            int m = scanner.nextInt();
            int accumulator = 0;
            for(int i=1; accumulator< n; i++){
                if(i%m == 0){
                    System.out.println(i);
                    accumulator++;
                }
            }
        } catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
