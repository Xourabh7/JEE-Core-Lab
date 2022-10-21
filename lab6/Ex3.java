package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex3 {
	
	 
	  public static void main(String[] args) {
	    int arr[] = {1,2};
	    HashMap<Integer, Integer> map = new HashMap<>();
	 
	    for(int i=0;i<arr.length;i++) {
	    	map.put(arr[i], arr[i]*arr[i]);
	    }
	    System.out.println(map);
		
		 			
		
	}

}
