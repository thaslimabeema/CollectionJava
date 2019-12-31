//STREAM FILTER

package com.deloitte;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		 
		List<Integer> nums=Arrays.asList(5,2,1);
				int sum=nums.stream().filter(i->i%2!=0).mapToInt((i)->i*i).sum();
		
				System.out.println("sum= "+sum);

	}

}
