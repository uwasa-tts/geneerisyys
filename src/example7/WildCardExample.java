package example7;

import java.util.ArrayList;
import java.util.List;

abstract class Muoto
{  
   abstract void piirra();
   abstract int getAla();
}  

class Kolmio extends Muoto
{  
	private int ala;

	public Kolmio()
	{
		ala = 1 + (int)(Math.random()*5);
	}
	void piirra() { System.out.println("piirretaan kolmio");}
	
	public int getAla() { return ala; }
} 

class Ympyra extends Muoto
{  
     void piirra() { System.out.println("piirretaan ympyra");}

	int getAla() {
		return 0;
	}  
}

class Nelikulmio
{
	void piirra() {System.out.println("piirret‰‰n nelikulmio");	}
}

class WildCardExample
{  
        //metodi, joka hyv‰ksyy ainoastaan abstraktista Muoto-luokasta perityn luokan  
        public static void piirraMuoto(List<? extends Muoto> lists)
        {  
             for(Muoto s:lists){  
                 s.piirra();  
            }  
        }
        
        public static <E extends Muoto> boolean onkoSamaAla(E muoto1, E muoto2)
        {
        	System.out.println("Ensimm‰isen kolmion ala " + muoto1.getAla());
        	System.out.println("Toisen kolmion ala " + muoto2.getAla());
        	return muoto1.getAla() == muoto2.getAla();
        }
       
        public static void main(String args[])
        {
               List<Kolmio> lista1 = new ArrayList<Kolmio>();
               Kolmio kolmio1 = new Kolmio();
               Kolmio kolmio2 = new Kolmio();
               lista1.add(kolmio1);
               lista1.add(kolmio2);
               
               List<Ympyra> lista2 = new ArrayList<Ympyra>();  
               lista2.add(new Ympyra());  
               lista2.add(new Ympyra()); 
               
               List<Nelikulmio> lista3 = new ArrayList<Nelikulmio>();  
               lista3.add(new Nelikulmio());  
               lista3.add(new Nelikulmio()); 
               
  
               piirraMuoto(lista1);  
               piirraMuoto(lista2); 
//             piirraMuoto(lista3);  // method piirraMuoto(List<? extends Muoto>) in the type WildCardExample is not applicable for the arguments (List<Nelikulmio>)
               
               System.out.println("Kolmioilla sama ala: " + onkoSamaAla(kolmio1, kolmio2));
        }
}
