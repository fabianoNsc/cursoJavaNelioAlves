package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product p = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
		System.out.println("-------------------------------------------------------");
		System.out.println("Product Data: " + p);
		System.out.println("-------------------------------------------------------");
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		System.out.println("Updated data: " + p);
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock:");
		quantity = sc.nextInt();
		p.removeProducts(quantity);
		System.out.println("Updated data: " + p);

		sc.close();
	}

}
