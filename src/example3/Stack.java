package example3;

public interface Stack <E>
{
	public boolean isEmpty();
	public boolean isFull();
	public void add(E obj);  // lisää olion pinon päällimmäiseksi
	public E peek(); // palauttaa pinon päällimmäisen ja poistaa sen pinosta
}

