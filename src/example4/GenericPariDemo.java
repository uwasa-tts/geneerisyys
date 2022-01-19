package example4;

import java.util.Scanner;

public class GenericPariDemo {

	public static void main(String[] args) {

		Pari<String> salainenPari = new Pari<String>("kissa", "koira");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Anna kaksi sanaa:");
		String sana1 = sc.next();
		String sana2 = sc.next();
		
		Pari<String> luettuPari = new Pari<String>(sana1, sana2);
		
		if(luettuPari.equals(salainenPari))
		{
			System.out.println("Arvasit sanat oikein oikeassa j‰rjestyksess‰!");
		}
		else
		{
			System.out.println("Arvasit v‰‰rin!");
			System.out.println("Arvasit sanat " + luettuPari);
			System.out.println("Salaiset sanat olivat " + salainenPari);
		}
		
	}

}
