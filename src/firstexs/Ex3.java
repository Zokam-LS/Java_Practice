package firstexs;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program evaluates if the entered number is prime");
        System.out.println("Insert a number to be evaluated: ");
        try{
            int n = scanner.nextInt();
            boolean isDivisible =  false;
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    isDivisible = true;
                    break;
                }
            }
            if (!isDivisible){
                System.out.println(n + " is prime");
            }else{
                System.out.println(n + " is not prime");
            }
        } catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
