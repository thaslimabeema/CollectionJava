package com.deloitte;
import java.util.*;

import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> trainees=new HashMap<>();
		trainees.put("hashir", "Jam");
		trainees.put("sid", "o");
		trainees.put("ria", "k");
		//System.out.println("Enter a name");
		for(String key:trainees.keySet())
		{
		
		System.out.println("Name "+key+"Location"+trainees.get(key));
		}

	}

}
