package FactoryDesign;

public class OperatingSystemFactory {
	
	public OS getInstance(String s)
	{
		if(s.equals("CLOSED"))
		{
			return new iOS();
		}
		else if(s.equals("OPEN"))
		{
			return new Android();
		}
		else
		{
			return new Windows();
		}
	}
}
