package Dhruvil_Soni;

public class Dhruvil_Soni_19BCP032_Pasta implements Dhruvil_Soni_19BCP032_Food {
	
	public String preparedItems;
	@Override
	public void prepareFood(String itemsRequired)
	{
		preparedItems = "Tomato Paste with ingredients : "+itemsRequired;
	}

	@Override
	public String deliverFood() 
	{
		return preparedItems;
	}
}
