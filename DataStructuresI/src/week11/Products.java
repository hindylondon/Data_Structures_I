package week11;

public class Products {
	//fields
	private String name;
	private double price;
	
	//constructor
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//getters, no setters because these never change
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	//nicely displays all the products for the user to choose from
	public void displayProducts(Products[] products){
		System.out.println("Store Products:");
		System.out.println();
		
		for (int i = 0; i < products.length; i++) {
			System.out.println("ID: " + (i + 1) + " " + products[i].name + " $" + products[i].price);
		}
		
		System.out.println();

	}

}
