package example4;

public class Pari<T> {

	private T eka;
	private T toka;
	
	public Pari()
	{
		eka = null;
		toka = null;
	}

	public Pari(T eka, T toka) {
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
		return "eka= " + eka + ", toka= " + toka;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj ==  null)
			return false;
		else if (getClass() != obj.getClass())
			return false;
		else
		{
			Pari<T> uusiPari = (Pari<T>) obj;
			return (eka.equals(uusiPari.eka) && toka.equals(uusiPari.toka));
		}
		
	}
	
	

	
}
