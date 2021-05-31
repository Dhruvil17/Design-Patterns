package FactoryDesign;

public class iOS implements OS {

	@Override
	public void spec() 
	{
		System.out.println("1. Most secured Operating System");
	}

	@Override
	public void call() 
	{
		System.out.println("2. Both video and audio calling is supported and video calling has full HD (1080p) support via Facetime");
	}

	@Override
	public void browse() 
	{
		System.out.println("3. Default browser is Safari and browsing speed is very fast.");
	}

	@Override
	public void sms() 
	{
		System.out.println("4. Default messanger is iMessagner");
	}

	@Override
	public void security() 
	{
		System.out.println("5. High level of security available in iPhones");
	}
	
}
