package example5;

public class Pari2 <T extends Comparable>{

	private T eka;
	private T toka;
	
	public Pari2()
	{
		eka = null;
		toka = null;
	}

	public Pari2(T eka, T toka) {
		this.eka = eka;
		this.toka = toka;
	}

	public T getEka() {
		return eka;
	}

	public void setEka(T uusiEka) {
		eka = uusiEka;
	}

	public T getToka() {
		return toka;
	}

	public void setToka(T uusiToka) {
		toka = uusiToka;
	}

	@Override
	public String toString() {
		return "eka=" + eka + ", toka=" + toka;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj ==  null)
			return false;
		else if (getClass() != obj.getClass())
			return false;
		else
		{
			Pari2<T> uusiPari = (Pari2<T>) obj;
			return (eka.equals(uusiPari.eka) && toka.equals(uusiPari.toka));
		}
		
	}	
	
	// geneerinen metodi max
	// täytyy olla luokassa extends Comparable
	public T max()
	{
		if(eka.compareTo(toka) > 0)
			return eka;
		else
			return toka;
	}
	
}
