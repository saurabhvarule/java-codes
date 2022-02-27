import java.util.ArrayList;
import java.io.*;

  
class Remove{


	public static void main(String[] args) throws IOException{  
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> arr = new ArrayList<String>(5);  
        
		arr.add("Saurabh");  
		arr.add("Harshal");  
		arr.add("Tanmay");  
		arr.add("Prajwal");  

		System.out.println("The list of the size is: " + arr.size());  
  
		for (String name : arr) {  
        
			System.out.println("Name is: " + name);  

		}

		System.out.println("Enter the index of string you want to remove : ");
		int n = Integer.parseInt(br.readLine());

		arr.remove(n);  

		System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
  

		for (String name : arr) {  
 
			System.out.println("Name is: " + name);  

		}  
	}  
}  
