package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.printf("Gender: ");
        bill.gender = sc.next().toUpperCase().charAt(0);
        System.out.printf("Amount of beer: ");
        bill.beer = sc.nextInt();
        System.out.printf("Amount of soda: ");
        bill.softDrink = sc.nextInt();
        System.out.printf("Amount of skewers: ");
        bill.barbecue = sc.nextInt();

        System.out.println("");
        System.out.println("REPORT:");
        double consumption = bill.feeding();
        System.out.printf("Consumption = R$ %.2f\n",consumption);
        double cover = bill.cover();
        System.out.printf("Cover = R$ %.2f\n",cover);
        double ticket = bill.ticket();
        System.out.printf("Ticket = R$ %.2f\n",ticket);

        System.out.println("");
        double total = bill.total();
        System.out.printf("Total payable = R$ %.2f\n",total);
    }
}
