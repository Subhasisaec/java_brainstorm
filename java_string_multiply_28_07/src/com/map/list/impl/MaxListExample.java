package com.map.list.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxListExample {
	public static void main(String args[]) {
		
		
		List<Map<String, Object>> listOfMaps = new ArrayList<>();

        // Create individual Map objects
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "AAA");
        map1.put("amount", 1000);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "BBB");
        map2.put("amount", 2000);
        
        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "CCC");
        map3.put("amount", 400);
        
        Map<String, Object> map4 = new HashMap<>();
        map4.put("name", "DDD");
        map4.put("amount", 800);
        
        

        // Add the Maps to the List
        listOfMaps.add(map1);
        listOfMaps.add(map2);
        listOfMaps.add(map3);
        listOfMaps.add(map4);
        
        System.out.println(listOfMaps);
        
        //getting Map Elements from List
        int currentCount=0;
        int previousCount=0;
        
        int currentValue=0;
        int previousValue=0;
        
        for (Map<String, Object> map : listOfMaps) {
        	
        	 currentValue = (int) map.get("amount");
        	
        	if(currentCount !=0 && currentValue > previousValue) {
        		
        		Collections.swap(listOfMaps, currentCount, previousCount);
        	}
        	
        	previousValue=currentValue;
        	
        	previousCount=currentCount;
        	currentCount++;
        	
        }
        
        System.out.println(listOfMaps);
        
        
        
        
//  <Intger> newMap = new HashMap<>();
        
//        System.out.println(listOfMaps);
//        
//       List<Entry<String, Integer>> entryList =  listOfMaps.stream().flatMap(m -> m.entrySet().stream()).collect(Collectors.toList());
//      
//       System.out.println(entryList);
//    List<Entry<String, Integer>> listt =  entryList.stream().sorted(Comparator.comparingInt(Map.Entry::getValue).re).collect(Collectors.toList());
//     
//    System.out.println(listt);
    /* for (Map<String, Object> map : listOfMaps) {
        	
            for (Map.Entry<String, Object> entry : map.entrySet()) {
            	
            	if(!newMap.isEmpty()) {
            		 int value = (int) newMap.get("amount");
            		 //System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            		
            		//System.out.println(value);
            	}
            	
            	
            	newMap.put("name",entry.getKey());
            	newMap.put("amount",entry.getValue());
            	
            	int value = (int) map.get("amount");
            	
            	System.out.println(value);
            	System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            
            
            System.out.println("--- End of Map ---");
        }*/
        
        //System.out.println(listOfMaps);
        
        
	}

}
