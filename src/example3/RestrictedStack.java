package example3;

public class RestrictedStack<E> implements Stack<E>{

	private int size = 0;
	private E[] table;
	
	public RestrictedStack(int maxSize) {
		table = (E[])new Object[maxSize];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == table.length;
	}

	public void add(E obj) {
		if(!isFull())
		{
			table[size] = obj;
			System.out.println("Lis�ttiin pinoon " + obj);
			size++;
		}
		else
		{
			System.out.println("Pino t�ynn�, " + obj + " ei mahdu pinoon");
		}
	}

	public E peek() {
		size--;
		E obj = table[size];
		table[size] = null;
		return obj;
	}

}
