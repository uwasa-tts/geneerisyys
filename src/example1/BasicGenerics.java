package example1;

import java.util.ArrayList;

public class BasicGenerics {

	public static void main(String[] args) {

		// ilman geneerisyyttä
	    ArrayList numList = new ArrayList();    
	    numList.add(10);  
	    numList.add("10");  
	    
	    System.out.println("Lista:");
		for (int i = 0; i < numList.size(); i++)
		{
		      System.out.println(numList.get(i));
		}
	    
	    // geneerisyyden kautta määritellään tallennettava tietotyyppi (Integer)  
	    ArrayList<Integer> strList = new ArrayList<Integer>();    
	    strList.add(10);  
	    //strList.add("10"); // aiheuttaa käännösaikaisen virheen  
	    
	    // ilman geneerisyyttä tarvitaan tyyppimuunnoksia
	    ArrayList helloList = new ArrayList();    
	    helloList.add("hello");
	    String s = (String) helloList.get(0); // tyyppimuunnos tarvitaan    
	    helloList.add(3.5);
	    Double d = (Double) helloList.get(1);
	    System.out.println(d);
	    
	    // määriteltäessä lista geneeriseksi ei tyyppimuunnosta tarvita  
	    ArrayList<String> helloList2 = new ArrayList<String>();    
	    helloList2.add("hello taas");    
	    String s2 = helloList2.get(0);
	}

}
