package example4;

import java.util.Scanner;

public class GenericPariDemo2 {

	public static void main(String[] args) {

		Pari<Integer> salainenPari = new Pari<Integer>(5, 13);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Arvaa kaksi lukua:");
		int luku1 = sc.nextInt();
		int luku2 = sc.nextInt();
		
		Pari<Integer> luettuPari = new Pari<Integer>(luku1, luku2);
		
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
	}

}

