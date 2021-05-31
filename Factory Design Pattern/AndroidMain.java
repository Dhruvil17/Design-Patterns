package FactoryDesign;

import java.util.*;
import FactoryDesign.OperatingSystemFactory;
import FactoryDesign.OS;
import FactoryDesign.iOS;
import FactoryDesign.Android;
import FactoryDesign.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String osType;
		System.out.println("Please choose the type of Operating System you want : ");
		System.out.println("Available types of Operating systems are : ");
		System.out.println("1. Closed Source \n2. Open Source \n3. Any Other Source");
		System.out.println("To choose 1 type CLOSED, for 2 type OPEN, for 3 type OTHER");
		osType = sc.next();
		
		OperatingSystemFactory obj1 = new OperatingSystemFactory();
		OS obj2 = obj1.getInstance(osType);
		obj2.spec();
		obj2.call();
		obj2.browse();
		obj2.sms();
		obj2.security();
		
		sc.close();
	}
}
