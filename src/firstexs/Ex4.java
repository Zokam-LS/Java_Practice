package firstexs;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program shows the first (n) prime numbers");
        System.out.println("Insert the number of iterations (n): ");
        try{
            boolean isDivisible = false;
            int num = 3;
            int n = scanner.nextInt();
            System.out.println("Displaying first " + n + " prime numbers");
            for ( int i = 2; i <= n;  ){
                for(int j = 2; j <= Math.sqrt(num); j++){
                    if(num%j == 0){
                        isDivisible = true;
                        break;
                    }
                }
                if(!isDivisible){
                    System.out.println(num);
                    i++;
                }
                isDivisible = false;
                num++;
            }
        } catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
