package example2;

import java.awt.Color;

public class GenericClassExample {

	public static void main(String[] args) {

		DemoClass<String> strInstance = new DemoClass<String>();
		strInstance.set("testisana");
//		strInstance.set(1);        // tämä aiheuttaisi käännösaikaisen virheen
		System.out.println(strInstance.toString());
		
		DemoClass<Integer> intInstance = new DemoClass<Integer>();
		intInstance.set(1);
		System.out.println(intInstance.toString());
		
		DemoClass<Double> doubleInstance = new DemoClass<Double>();
		doubleInstance.set(2.3);
		System.out.println(doubleInstance.toString());
		
		DemoClass<Color> colorInstance = new DemoClass<Color>();
		colorInstance.set(Color.BLUE);
		System.out.println(colorInstance.toString());
	}

}
