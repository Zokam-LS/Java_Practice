package firstexs;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program shows the first pair numbers until reaching 'n'.");
        System.out.println("Insert 'n'");
        try{
            int n = scanner.nextInt();
            for(int i=1; i<= n; i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        } catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
