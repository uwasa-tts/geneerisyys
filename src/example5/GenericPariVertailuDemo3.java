package example5;

import java.util.Scanner;

public class GenericPariVertailuDemo3 {

	public static void main(String[] args) {

		Pari2<Integer> salainenPari = new Pari2<Integer>(5, 13);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Arvaa kaksi lukua:");
		int luku1 = sc.nextInt();
		int luku2 = sc.nextInt();
		
		Pari2<Integer> luettuPari = new Pari2<Integer>(luku1, luku2);
		
		if(luettuPari.equals(salainenPari))
		{
			System.out.println("Arvasit luvut oikein oikeassa j‰rjestyksess‰!");
		}
		else
		{
			System.out.println("Arvasit v‰‰rin!");
			System.out.println("Arvasit luvut " + luettuPari);
			System.out.println("Salaiset luvut olivat " + salainenPari);
		}

		System.out.println("Suurempi arvaamistasi luvuista oli " + luettuPari.max());
		System.out.println("Suurempi arvattavista luvuista oli " + salainenPari.max());

	}

}