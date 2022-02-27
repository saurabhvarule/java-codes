import java.io.*;

class ArrMirror{
 
	static boolean isMirrorInverse(int arr[]){
		 
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[arr[i]] != i)
                
				return false;
       		}
 
		return true;
    
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the length of array : ");
		int ln = Integer.parseInt(br.readLine());
		
		int[] arr = new int[ln];

		for(int i = 0; i < ln; i++){

			arr[i] = Integer.parseInt(br.readLine());

		}
       
		if (isMirrorInverse(arr))
        
			System.out.println("Yes, the given array is mirror inverse.");
		else
        
			System.out.println("No, the given array is not mirror inverse.");
	}
}
