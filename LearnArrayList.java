package trimester6;

import java.util.*;

public class LearnArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("First Name");
		list.add("Middle Name");
		list.add("Last Name");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		list.remove(1);
		
		System.out.println(list);
		
		list.set(list.size()-1, "Meh");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		
		System.out.println("\n\n");
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(17);
		al.add(2);
		al.add(21);
		al.add(32);
		al.add(81);
		
		Collections.sort(al);
		
		System.out.println(al);
	}
	
}
