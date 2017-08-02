/**
 *We are creating a program for the Retail Store Management System,
 *and performing different different function which was asked to perform
 */
package retail;

import java.util.ArrayList;

/**
 * 
 * @author Nitish Singh here we are creating a customer class
 *
 */
public class Customer {
	// here we are declaring some customer class properties
	public int customerId;
	String customerName;
	int customerNo;
	// here we are creating the arrayList for the product which is booked
	ArrayList<Product> bookedProductList = new ArrayList<Product>();

	// here we are creating a method addBookedProduct
	// this method will give us he idea about the product which
	// is booked by the customer
	public void addBookedProduct(Product obj) {
		/*
		 * here customer will know which booked product is unavailable in his
		 * productList and also add product in his productList
		 */
		obj.setProductStatus("unavailable");
		bookedProductList.add(obj);

	}

	/**
	 * here we are creating constructor for the customer class
	 * 
	 * @param customerId
	 * @param customerName
	 * @param customerNo
	 */
	public Customer(int customerId, String customerName, int customerNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerNo = customerNo;
	}

	/**
	 * here we are using getter n setter with all three properties of customer
	 * class we are using the getter n setter because it help us to view the
	 * value of the variables,and we can also modify the value with the help of
	 * this getter n setter
	 * 
	 * @return
	 */

	public int getCustomerId() {
		return customerId;

	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int CustomerNo) {
		this.customerNo = CustomerNo;
	}

}
