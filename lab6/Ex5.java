package lab6;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
	

	public static void main(String[] args) {
		List<Integer> nl = Arrays.asList(1,3,2,5,6);
		int[] primitive = nl.stream().mapToInt(Integer::intValue).toArray();
		for(int i=4;i<primitive.length;i++) {
			Arrays.sort(primitive);
			System.out.println(Arrays.toString(primitive));
			System.out.println(primitive[1]);
		}

	}

}


//int[] primitive = nl.stream().mapToInt(Integer::intValue).toArray();