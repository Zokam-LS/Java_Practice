package firstexs;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program shows the first 'n' natural numbers which have at least 'm' number of 'd' digits");
        try{
            System.out.println("Enter the amount of numbers to be shown (n): ");
            int n = scanner.nextInt();
            System.out.println("Enter the amount of digits a number must have to comply the condition (m): ");
            int m = scanner.nextInt();
            System.out.println("Enter the digit between 0-9 to be evaluated in each number (d): ");
            int d = scanner.nextInt();

            String stringD = Integer.toString(d);
            int numbersFound = 0;
            for(int i = 1; numbersFound < n; i++){
                int numOfDigitsFound = 0;
                String stringNum = Integer.toString(i);
                for (int j = 0; j < stringNum.length(); j++){
                    if (stringNum.substring(j, (j+1)).equals(stringD)){
                        numOfDigitsFound++;
                    }
                }
                if (numOfDigitsFound >= m){
                    System.out.println(i);
                    numbersFound++;
                }
            }
            System.out.println("Finished and found " + numbersFound + " numbers fulfilling the criteria");
        } catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
