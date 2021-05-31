package Dhruvil_Soni;

public class Dhruvil_Soni_19BCP032_Pizza implements Dhruvil_Soni_19BCP032_Food {
	
	public String preparedItems;
	@Override
	public void prepareFood(String itemsRequired)
	{
		preparedItems = "Pizza prepared with ingredients : "+itemsRequired;
	}

	@Override
	public String deliverFood() 
	{
		return preparedItems;
	}
}
