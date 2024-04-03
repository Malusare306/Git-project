package com.velocity.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Nitin");
		nameList.add("Neha");
		nameList.add("Ashish");
		nameList.add("Saurabh");
		
		Iterator <String> itr = nameList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		for(String name : nameList ) {
			System.out.println(name);
		}
	}

}
