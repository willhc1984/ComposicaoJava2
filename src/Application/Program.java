package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Scanner sc = new Scanner(System.in);
		Client client = new Client();
		Order order = new Order();
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		order = new Order(new Date(), status, client);

		System.out.print("How many items to this order: ");
		int quantity = sc.nextInt();
				
		for(int i=1; i<=quantity; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Quantity:");
			double quantityProduct = sc.nextInt();
			System.out.print("Price:" );
			double price = sc.nextDouble();
			Product product = new Product(productName, price);
			OrderItem orderItem = new OrderItem(quantityProduct, price, product);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order);
	}

}
