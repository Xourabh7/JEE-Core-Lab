package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex4 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> stud = new HashMap<>();
		stud.put(1,95);
		stud.put(2,86);
		stud.put(3,75);
		stud.put(4,80);
		stud.put(5,90);
		
		HashMap<Integer,String> prize = new HashMap<>();
		Iterator<Integer> itr = stud.keySet().iterator();
		
		while(itr.hasNext()){
			Integer key = itr.next();
				if(stud.get(key)>=90 && stud.get(key)<100) {
					prize.put(key, "Gold");
				}else if(stud.get(key)>=80 && stud.get(key)<90) {
					prize.put(key, "Silber");
				}else if(stud.get(key)>=70 && stud.get(key)<80){  
					prize.put(key, "Bronze");
				}
		}
	
		System.out.print(prize);

	}
}
