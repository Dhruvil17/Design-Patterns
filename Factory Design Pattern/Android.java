package FactoryDesign;

public class Android implements OS 
{
	@Override
	public void spec() 
	{
		System.out.println("1. Most Powerful Operating System");
	}

	@Override
	public void call() 
	{
		System.out.println("2. Both video and audio calling is supported");
	}

	@Override
	public void browse()
	{
		System.out.println("3. Default browser is Google Chrome and browsing speed is moderate.");
	}
	
	@Override
	public void sms() 
	{
		System.out.println("4. Default messanger is Android messanger");
	}

	@Override
	public void security() 
	{
		System.out.println("5. Moderate level of security available in Android Phones");
	}
	
}

