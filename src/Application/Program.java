package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date: DD/MM/YYYY");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		int quantity = sc.nextInt();
		
		Order order = new Order(birthDate, status);
		System.out.print("How many items to this order: ");
				
		for(int i=1; i<=quantity; i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.println("Product name: ");
			String productName = sc.nextLine();
			System.out.println("");
			System.out.println("Quantity:");
			int quantityProduct = sc.nextInt();
			
		}
		
		
	}

}
