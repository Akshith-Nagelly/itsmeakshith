
package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.lti.model.Student;

public class CollectionDemo {

	// public static void main(String[] args) {
	// Set<String> names=new HashSet<String>();
	// names.add(new String("ak"));
	// names.add(new String("pk"));
	// names.add(new String("kk"));
	// names.add(null);
	// System.out.println(names);

	// System.out.println(names.contains("ak"));

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add(new String("ak"));
		names.add(new String("pk"));
		names.add(new String("kk"));
		names.add(new String("lk"));
		System.out.println(names);

		System.out.println(names.contains("ak"));
		System.out.println(names);

		System.out.println(names.contains("ak"));
		System.out.println(names.remove("pk"));
		System.out.println(names);

	//}
	//Map<Integer,String > credentials=new HashMap<Integer, String>();	
	//credentials.put(1, "ak1");
	//credentials.put(2, "pk");
	//credentials.put(3, "gk");
	//credentials.put(4, "ck");
	//credentials.put(5, "gg1");
	//System.out.println(credentials);
	
	Map<Integer,String > credentials=new TreeMap<Integer, String>();	
	credentials.put(1, "ak1");
	credentials.put(2, "pk");
	credentials.put(3, "gk");
	credentials.put(4, "ck");
	credentials.put(5, "gg1");
	System.out.println(credentials);
	
	Set<Entry<Integer, String>> entryset=credentials.entrySet();
	Iterator<Entry<Integer, String>> iterators=entryset.iterator();
	
	while(iterators.hasNext()) {
		
		Entry<Integer,String> item=iterators.next();
		System.out.println(item.getKey()+" "+item.getValue());
		
	}
	Iterator<String> allNames=names.iterator();
	while(allNames.hasNext()) {
		String name=allNames.next();
		System.out.println(name);
	}
	
}
}
