package com.velocity.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> primeNumberList = new LinkedList<Integer>();
		
		primeNumberList.add(2);
		primeNumberList.add(3);
		primeNumberList.add(5);
		primeNumberList.add(7);
		primeNumberList.add(9);

		
		Iterator<Integer> itr = primeNumberList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Integer num : primeNumberList) {
			System.out.println(num);
		}
	}

}
