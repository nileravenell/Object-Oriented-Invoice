package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Inventory> allInventory = new ArrayList<Inventory>();
        ArrayList<Purchase> allPurchases = new ArrayList<Purchase>();

        Inventory inventory = new Inventory();

        inventory.setProduct("Bison Sweater");
        inventory.setPrice(55.99);
        allInventory.add(inventory);

        inventory.setProduct("Bison Tee");
        inventory.setPrice(14.99);
        allInventory.add(inventory);

        inventory.setProduct("Bison Hoodie");
        inventory.setPrice(23.99);
        allInventory.add(inventory);

        inventory.setProduct("Bison Bumpersticker");
        inventory.setPrice(4.99);
        allInventory.add(inventory);

        String answer = " ";
        input = new Scanner(System.in);
        String item;
        double sum = 0.0;
        int index = -1;
        do {
            System.out.println("What did you purchase?: ");
            item = input.nextLine();
            Purchase purchase = new Purchase();
            for (int i = 0; i < allPurchases.size(); i++) {
                if (item.equals(allPurchases.get(i))) {
                    index = i;
                    String in = allPurchases.get(index).getItem();
                    double c = allPurchases.get(index).getCost();
                    purchase.setItem(in);
                    purchase.setCost(c);
                    allPurchases.add(purchase);
                }
            }
        } while (!item.equals("Done"));
        double cost = 0.0;
        for (int i = 0; i < allPurchases.size(); i++) {
            double itemPurchased = allPurchases.get(i).getCost();
            cost += itemPurchased;
        }
        System.out.println("Your total is $" + cost);
    }
}
