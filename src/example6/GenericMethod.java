package example6;

public class GenericMethod {

	public static <T> int countAllOccurrences(T[] list, T item) {
		   int count = 0;
		   if (item == null) {
		      for ( T listItem : list )
		         if (listItem == null)
		            count++;
		   }
		   else {
		      for ( T listItem : list )
		         if (item.equals(listItem))
		            count++;
		   }
		   return count;
		}   
	
		
	public static void main(String[] args) {

		Integer[] intArray = {1, 2, 3, 4, 5, 2, 3, 4, 4, 5, 2, 3, 1, 5, 2, 3, 5, 2};
		
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

		Character[] charArray = {'H', 'E', 'L', 'L', 'O', 'Y', 'O', 'U'};
		
		
		int counter;
		for(int i = 1; i<6; i++)
		{
			counter = countAllOccurrences(intArray, i);
			System.out.println(i + ": " + counter);
		}
		
		counter = countAllOccurrences(charArray, 'E');
		System.out.println("E: " + counter);
		counter = countAllOccurrences(charArray, charArray[2]);
		System.out.println(charArray[2] + ": " + counter);
	}
}
