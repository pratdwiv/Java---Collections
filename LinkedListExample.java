package com.collections.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> states = new LinkedList<>();
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add("Colorado");
		states.add("Connecticut");
		
		states.addFirst("Alabama");
		System.out.println(states);
		System.out.println("Get last element: "+ states.getLast());
		
		ListIterator<String> iterator = states.listIterator(states.size());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
