package example2;

import java.awt.Color;

public class AvainArvoPari<K, V>
{
	private K key;
	private V value;
	
	public void set (K key, V value)
	{ this.key = key; this.value = value; }
	
	public K getKey () { return key; }
	public V getValue () { return value; }
	
	public String toString()
	{
		return key + " " + value;
	}
	
	public static void main (String[] args)
	{
		AvainArvoPari<Integer, String> pari1 = new AvainArvoPari<> ();
		pari1.set (42, "Hello world");
		System.out.println(pari1.toString());
		
		DemoClass<Color> colorInstance = new DemoClass<Color>();
		colorInstance.set(Color.BLUE);
		AvainArvoPari<Integer, DemoClass> pari2 = new AvainArvoPari<> ();
		pari2.set (54, colorInstance);
		System.out.println(pari2.toString());
		
		AvainArvoPari<Integer, Double> pari3 = new AvainArvoPari<> ();
		pari3.set (54, 3.55);
		System.out.println(pari3.toString());
	}

}
