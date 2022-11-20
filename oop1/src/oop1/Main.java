package oop1;

public class Main {
	public static void main(String[] args) {

		Product product1 = new Product();
		// set value
		product1.setName("Philips Headphones");
		product1.setDiscount(10);
		product1.setUnitPrice(350);
		product1.setUnitsInStock(20);

		Product product2 = new Product();
		product2.setName("Apple Headphones");
		product2.setDiscount(7);
		product2.setUnitPrice(450);
		product2.setUnitsInStock(20);

		Product product3 = new Product();
		product3.setName("JBL Headphones");
		product3.setDiscount(5);
		product3.setUnitPrice(650);
		product3.setUnitsInStock(20);

		// get
		/*
		 * System.out.println(product1.name); System.out.println(product1.unitPrice);
		 * System.out.println(product1.discount);
		 * System.out.println(product1.unitsInStock);
		 */

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("111111111");
		individualCustomer.setCustomerNumber("123123");
		individualCustomer.setFirstName("Murat");
		individualCustomer.setLastName("Kaya");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kaya Logistic");
		corporateCustomer.setPhone("12312312312");
		corporateCustomer.setTaxNumber("4324234");
		corporateCustomer.setCustomerNumber("24352352");
		
		Customer[] customers =  {individualCustomer, corporateCustomer};
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}

	}
}
