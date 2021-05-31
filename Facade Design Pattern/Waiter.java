package Dhruvil_Soni;

public class Dhruvil_Soni_19BCP032_Waiter {
		
	public static String deliverFood(String s)
	{
		Dhruvil_Soni_19BCP032_Ingredients ingredients = new Dhruvil_Soni_19BCP032_Ingredients();
		
		if(s.equals("Pizza"))
		{
			Dhruvil_Soni_19BCP032_Food pizza = new Dhruvil_Soni_19BCP032_Pizza();
			String pizzaItems = ingredients.getPizzaItems();
			pizza.prepareFood(pizzaItems);
			return pizza.deliverFood();
		}
		if(s.equals("Pasta"))
		{
			Dhruvil_Soni_19BCP032_Food pasta = new Dhruvil_Soni_19BCP032_Pasta();
			String pastaItems = ingredients.getPastaItems();
			pasta.prepareFood(pastaItems);
			return pasta.deliverFood();
		}
		return null;
	}
}
