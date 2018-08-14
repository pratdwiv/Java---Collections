package com.collections.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("violet", "indigo", "blue",
								"green", "yellow", "orange", "red");
		Iterator<String> iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
