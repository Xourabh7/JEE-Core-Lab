package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex6 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> voter = new HashMap<>();
		voter.put(1001,20);
		voter.put(1002,19);
		voter.put(1003,10);
		voter.put(1004,28);
		voter.put(1005,8);
		
		List<Integer> eligibility = new LinkedList<>();
		Iterator<Integer> itr = voter.keySet().iterator();
		
		while(itr.hasNext()){
			Integer key = itr.next();
				if(voter.get(key)>=18 ) {
					eligibility.add(key);
				}
				
				}
		
	
		System.out.print(eligibility);
		
	}

}
