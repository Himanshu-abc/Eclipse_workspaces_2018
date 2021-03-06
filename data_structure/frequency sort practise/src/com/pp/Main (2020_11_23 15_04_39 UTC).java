package com.pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 }; 
		
		Map<Integer,Integer> map=new LinkedHashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int current : array) {
			
			int count = map.getOrDefault(current, 0);
			map.put(current, count+1);
			list.add(current);
		}
		
		Cmp cmp=new Cmp(map);
		
		Collections.sort(list, cmp);
		
		for(int i:list) {
			System.out.print(i+" ");
		}
		
	}
	
}
	
	class Cmp implements Comparator<Integer>{
		
		private Map<Integer,Integer> tmap;
		
		public Cmp(Map<Integer, Integer> map) {
			this.tmap=map;
		}

		@Override
		public int compare(Integer o1, Integer o2) {
		
			int freqcmp = tmap.get(o2).compareTo(tmap.get(o1));
			
			int valuecmp=o2.compareTo(o1) ;
			
			if(freqcmp==0)
				return valuecmp;
			else
				return freqcmp;
		}
		
	}
