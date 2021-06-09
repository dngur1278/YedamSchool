package co.friend.common;

/* Collection -> List(interface) -> ArrayList, Vector, LinkedList
           	  -> set(interface) -> HashSet, TreeSet
           	  
           	  Map(interface)
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionEx {

	public static void main(String[] args) {
		List<String> list = null;
		list = new ArrayList<String>();
		list.add("Hong");
		list.add("Hong");
		list.add("Park");
		list.add("Choi");
		
		list.remove(0);
		System.out.println("<List>");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Set<String> set = new HashSet<>();
		set.add("Hong");
		set.add("Hong");
		set.add("park");
		set.add("Choi");
		
		System.out.println("<set>");
		//set요소를 가져오기위해 반복자를 생성
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		}
		
	}

}
