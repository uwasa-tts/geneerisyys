package example3;

public interface Stack <E>
{
	public boolean isEmpty();
	public boolean isFull();
	public void add(E obj);  // lis‰‰ olion pinon p‰‰llimm‰iseksi
	public E peek(); // palauttaa pinon p‰‰llimm‰isen ja poistaa sen pinosta
}

