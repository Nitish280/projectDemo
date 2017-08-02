package retail;

import java.util.Scanner;

/**
 * here we are creating the class RetalShop here we will perform our main
 * function
 * 
 * @author Nitish Singh
 *
 */
public class RetailShop {
	// here we creating the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we are creating the object of the RetailStore Class
		RetailStore store = new RetailStore("Spencer");
		// here we are creating the scanner for taking the input from
		// the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");// print statement
		String name = sc.nextLine();// here we are taking the name from the user

		System.out.println("Ener your Contact No:");
		int contactNo = sc.nextInt();// here we are taking the contact no from
										// the user
		// here we are creating object for the customer class
		Customer customer = store.addCustomer(name, contactNo);
		int customerId = customer.getCustomerId();// here we will get the id
													// from the customer

		// here we are adding some product in the productList
		store.addProduct("Television", "Available", 15000);
		store.addProduct("Refrigerator", "Available", 12000);
		store.addProduct("Micro Oven", "Available", 8000);

		System.out.println("Hello Visitor, you're visiting store Spencer.");// print
																			// statement
		// here we are calling display method
		store.display();
		System.out.println("Please Enter the ProductName:");// print statement
		String productName = sc.next();// here we are getting the productName
										// from the user
		System.out.println("Enter the no of Product:");// print statement
		int NumberOfProduct = sc.nextInt();// here we are getting the no of
											// product from the user
		// here we are put the the whole information about the store and booked
		// product in the r
		int r = store.bookproduct(customerId, productName, NumberOfProduct);
		System.out.println(r);
		// here we are applying condition for checking some specific case
		while (r == 0) {
			System.out.println("Entered product is not available in the productlist");// print
																						// statement
			store.display();// here we are calling display method
			System.out.println("Please Enter the valid Product: ");// print
																	// statement
			productName = sc.next();// here we are getting the productName from
									// the user
			r = store.bookproduct(customerId, productName, NumberOfProduct);

		}
		sc.close();// here we will close our scanner

		System.out.println("Net Amount" + store.calculateNetAmount(customerId, 10));// print
																					// Statement

	}

}
