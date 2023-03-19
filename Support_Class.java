package absoft;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class Support_Class {
    public static void main(String[] args) {

    }

    static void enteringValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of products to review");
        int quaOfAllProducts = sc.nextInt();
        String [] productsName = new String[quaOfAllProducts]; // Масив з іменами введених продуктів
        double [] totalPrice = new double[quaOfAllProducts];   // Масив з кінцевою ціною за продукт

        totalArray(quaOfAllProducts, productsName, totalPrice);

        if (totalPrice[quaOfAllProducts - 1] != 0) {
            for (int i = 0; i < quaOfAllProducts; i++) {
                System.out.println(productsName[i] + " | " + totalPrice[i]);
            }
        }
    }

    static void totalArray(int quaOfAllProducts, String [] arrNames, double [] arrTotal) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quaOfAllProducts; i ++) {
            System.out.println("Enter Product Name of " + (i + 1) + " product: ");
            arrNames[i] = sc.nextLine();

            System.out.println("Enter Price of " + arrNames[i] + " product: ");
            double productsPrice = sc.nextDouble();
            if (equalToZero(productsPrice)) break;

            System.out.println("Enter Quantity of " + arrNames[i] + " product: ");
            int productsQuantity = sc.nextInt();
            if (equalToZero(productsQuantity)) break;

            arrTotal[i] = productsPrice * productsQuantity;
            sc.nextLine();
        }
    }

    static boolean equalToZero(double num) {
        if (num == 0) {
            System.out.println("Price and Quantity CAN NOT be equal to 0");
            return true;
        }
        else
            return false;
    }

    static boolean equalToZero(int num) {
        if (num == 0) {
            System.out.println("Price and Quantity CAN NOT be equal to 0");
            return true;
        }
        else
            return false;
    }

}
