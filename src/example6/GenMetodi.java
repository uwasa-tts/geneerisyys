package example6;

public class GenMetodi
{
	public static <T> void swap(Box<T> left, Box<T> right)
	{
		T temp = left.get ();
		left.set (right.get ());
		right.set (temp);
	}
	
	public static void main(String[] args)
	{
		Box<Double> box1 = new Box<Double>();
		box1.set(5.6);
		
		Box<Double> box2 = new Box<Double>();
		box2.set(3.6);
		
		System.out.println("Box1 " + box1.get());
		System.out.println("Box2 " + box2.get());
		
		swap(box1, box2);
		
		System.out.println("Box1 " + box1.get());
		System.out.println("Box2 " + box2.get());
		
	}
	
}
