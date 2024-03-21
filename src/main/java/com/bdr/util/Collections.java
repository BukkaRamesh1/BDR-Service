package com.bdr.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.bdr.model.User;

/*
 * 
 *   List  -- arraylist   --- arrays10000 , linkedlist   -- double linked list 
 *   Set  -- treeset, linkedhashset, hashset -- to avoid duplicates
 *   Map  -- treemap, hashmap, linkedhashmap
 *   Queue -- priorityqueue, arrayDeque
 *   
 *   
 *   
 *   WAP on same below and get data compared with TreeSet resove the below Issue
 * 
 * 
 */

public class Collections {
	
	public static void main(String[] args) {
		User u1 = new User(1, "Alex"); 
		
		User u2 = new User(2, "Zin"); 

		User u3 = new User(3, "Shawn"); 
		
	User u4 = new User(1, "Alex"); 
		
		User u5 = new User(2, "Zin"); 

		User u6 = new User(3, "Shawn"); 

		
		List<User> l1 = new ArrayList<User>();
		l1.add(u1);
		l1.add(u2);
		l1.add(u3);
		l1.add(u4);
		l1.add(u5);
		l1.add(u6);
		
		
		
		Map<Integer, String> uMap = new LinkedHashMap<Integer, String>();
		
		uMap.put(1, "Alex");
		
	
		
		
		Set<User> set = new TreeSet<User>(l1);
		
		
		for(User user: set) {
			System.out.println(user);  // 
		}
		
		for(int i =0; i<l1.size(); i++ ) {
			l1.get(i);
			//System.out.println(l1.get(i));
		}
		
		
		List<User> l2 = new LinkedList<User>();
		l2.add(u1);
		l2.add(u2);
		l2.add(u3);
		
		
		for(User u : l2) {
			//System.out.println(u);
		}
		
		
		
		// performace test on list 
		
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		
		
		
		for(int i=0; i<10000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		
		long arrayListStartTime = System.nanoTime(); // 1

		for(int i=0; i<10000; i++) {
			arrayList.add(5000,i);
		}
		
		long arrayListEndTime = System.nanoTime();  //10
		
		long arrayListTimeTaken = arrayListEndTime - arrayListStartTime;
		
		
		long linkListStartTime = System.nanoTime(); // 1

		for(int i=0; i<10000; i++) {
			linkedList.add(5000,i);
		}
		
		long linkListEndTime = System.nanoTime();  //10
		
		long linkListTimeTaken = linkListEndTime - linkListStartTime;
		
		
		// time taken by both arraylist and linkedlist
		
		
		System.out.println("time taken by both arraylist and linkedlist");
		System.out.println("ArrayList: " +arrayListTimeTaken + " nanoseconds");
		System.out.println("LinkedList: " +linkListTimeTaken + " nanoseconds");

		
		
		
		
		
		
	}
	
	

}
