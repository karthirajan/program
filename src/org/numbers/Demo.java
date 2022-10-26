package org.numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		
		
		// string
		
		String s = "Welcome to java to";
		
		Map<String, Integer> m = new HashMap<>();
		System.out.println(m);
				
		// welcome = 1, to = 2 , java = 1
		String[] words = s.split(" ");
		for (String c : words) {
			
			if(m.containsKey(c)){
				
				Integer i = m.get(c);
				m.put(c, i+1);
				
			}else{
				m.put(c, 1);
			}
			
		}
		
	
		System.out.println(m);
		
		
		
		
	}

}
