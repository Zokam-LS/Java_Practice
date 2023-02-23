package thirdexs;

import java.util.ArrayList;
import java.util.Scanner;


public class Product {
        private String name;
        private Integer price;

        public Product(String name, Integer price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setnAME(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        static Scanner sn = new Scanner(System.in);

    public static String mainInfo = """
            Enter the number of the option you would like to execute\s
            1.- Add a product\s
            2.- Modify a product\s
            3.- Show all products\s
            4.- Delete a product\s
            5.- Exit""";


    public static void options(Integer selectedOption){
        switch (selectedOption) {
            case 1 -> addProduct();
            case 2 -> modifyProduct();
            /*case 3 -> showProducts();
            case 4 -> deleteProduct(); */
            default -> {
                System.out.println("Closing the app");
            }
        }
    }

    public static ArrayList<Product> products = new ArrayList<Product>();
    public static void addProduct(){
        System.out.println("Please enter the name of the new product");
        String newProductName = sn.next();

        if(!products.contains(newProductName)){
            System.out.println("Please enter the price of the product with name: " + newProductName);
            Integer newProductPrice = sn.nextInt();
            Product newProduct = new Product(newProductName, newProductPrice);
            products.add(newProduct);
            System.out.println("Product added.");
        }else{
            System.out.println("The product: " + newProductName + " is already assigned.");
        }
    }
    public static void modifyProduct(){
        System.out.println("Please enter the name of the product to be modified");
        String productToBeModified = sn.next();
        if (products.contains(productToBeModified)){
            int indexOfItem = products.indexOf(productToBeModified);
            System.out.println("The selected item is: " + products.get(indexOfItem));
            System.out.println("Please enter the new name");
            String newName = sn.next();
            System.out.println("Please enter the new price");
            Integer newPrice = sn.nextInt();

            Product productWithModifications = new Product(newName, newPrice);
            products.set(indexOfItem, productWithModifications);
        }else{
            System.out.println("The product doesn't exist in the database");
        }
    }
}
