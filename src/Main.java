import thirdexs.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Welcome to [ProductManagingApp], 1 to continue, 99 to exit");
        int command = sn.nextInt();
        while(command != 99){
            System.out.println(Product.mainInfo);
            Integer selectedOption = sn.nextInt();
            Product.options(selectedOption);
            command = selectedOption;
        }
    }
}