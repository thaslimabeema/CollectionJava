package com.deloitte;
import java.util.*;

import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
 		
		
		Map<Character,Integer> charOcc=new HashMap<>();
		String str="Rahul shetty";
		for(char c:str.toCharArray())
		{
			if(charOcc.containsKey(c))
			{
				int oc=charOcc.get(c)+1;
				charOcc.put(c, oc);			
			}
			else
			{
				charOcc.put(c, 1);
			}
		}
		
		charOcc.forEach((c,oc)->System.out.println(c+"->"+oc));

	}

}
