import java.util.Scanner;
public class Ex9 {
	
		static int secSmallest(int arr[], int n)
		   {
		      // assigning first element as smallest temporarily
		      int smallest = arr[0];

		      // we find the smallest element here
		      for (int i=0; i < n; i++){
		         if(arr[i] < smallest)
		            smallest = arr[i];
		      }

		     // temporarily assinging largest max value
		     int sec_smallest = Integer.MAX_VALUE;


		     // finding second smallest here
		     for (int i=0; i < n; i++){
		         if(arr[i] != smallest && arr[i] < sec_smallest)
		           sec_smallest = arr[i];
		     }

		    return sec_smallest;
		   }
		  
		  public static void main(String args[])
		  {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter size: ");
			  int n = sc.nextInt();
			  int[] arr= new int[n];
			  for(int i=0;i<n;i++) {
				  System.out.println("Enter num: ");
				  arr[i]=sc.nextInt();
				 
			  }
		      for(int num:arr) {
		      System.out.print(secSmallest(arr,n)); 
		   }	
		
		
	}	
}
