package Dhruvil_Soni;

public class Dhruvil_Soni_19BCP032_Customer {

	public static void main(String[] args) {
		
		//Without Facade Design Pattern
		System.out.println("WITHOUT FACADE DESIGN PATTERN");
		Dhruvil_Soni_19BCP032_Ingredients ingredients = new Dhruvil_Soni_19BCP032_Ingredients();
		
		Dhruvil_Soni_19BCP032_Food pasta = new Dhruvil_Soni_19BCP032_Pasta();
		String pastaItems = ingredients.getPastaItems();
		pasta.prepareFood(pastaItems);
		System.out.println(pasta.deliverFood());
		
		Dhruvil_Soni_19BCP032_Food pizza = new Dhruvil_Soni_19BCP032_Pizza();
		String pizzaItems = ingredients.getPizzaItems();
		pizza.prepareFood(pizzaItems);
		System.out.println(pizza.deliverFood());
		
		//With Facade Design Pattern
		System.out.println("\n\nWITH FACADE DESIGN PATTERN");
		System.out.println(Dhruvil_Soni_19BCP032_Waiter.deliverFood("Pasta"));
		System.out.println(Dhruvil_Soni_19BCP032_Waiter.deliverFood("Pizza"));	
	}
}
