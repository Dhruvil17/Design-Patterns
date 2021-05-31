package FactoryDesign;

public class Windows implements OS {

	@Override
	public void spec() 
	{
		System.out.println("1. Less efficient Operating System");
	}

	@Override
	public void call()
	{
		System.out.println("2. Only audio calling is supported");
	}

	@Override
	public void browse() 
	{
		System.out.println("3. Default browser is Edge and browsing speed is low.");
	}

	@Override
	public void sms()
	{
		System.out.println("4. Default messanger is Windows Messagner");
	}

	@Override
	public void security() 
	{
		System.out.println("5. Low level of security available in Windows Phones");
	}
	
}
