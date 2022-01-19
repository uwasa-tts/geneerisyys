package example6;

public class Box<T>
{
		private T value;
		
		public Box()
		{}
		
		public Box(T value)
		{
			this.value = value;
		}
		
		public void set (T t) { value = t; }
		public T get () { return value; }


		public <S> void showValues(S otherValue)
		{
			System.out.println("Arvo on " + value);
			System.out.println("Toinen arvo on " + otherValue);
		}
		
	public static void main (String[] args)
	{
		Box<Integer> box = new Box<Integer>(35);
		box.<String>showValues("kissa");
		
		box.<Integer>showValues(6);
	}
}
