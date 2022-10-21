package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex7 {
	static int reverseDigits(int num)
	{
	    int rev_num = 0;
	    while (num > 0)
	    {
	        rev_num = rev_num * 10 + num % 10;
	        num = num / 10;
	    }
	    return rev_num;
	}
	
	static void sortArr(int arr[], int n){
		List<int[]> ra = new ArrayList<>();
		for(int i=0;i<n;i++) {
			ra.add(new int[] {reverseDigits(arr[i]),(arr[i])});
		}
			Collections.sort(ra, (a,b)-> a[0]-b[0]);
			for(int i = 0; i < ra.size(); i++) 
		        System.out.print(ra.get(i)[1] + " ");
		
	}
	

	public static void main(String[] args) {
		int arr[]= {10,30,20};
		int n = arr.length;
		
		sortArr(arr,n);
		
		

	}

}
//35 44 25 28 11 - reverse
//44 35 28 25 11 - sort