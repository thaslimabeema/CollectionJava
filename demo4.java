//  LEAP YEAR USING STREAMA ND FILTER

package com.deloitte;

import java.util.*;
 

public class demo4 
{
	public static void main(String args[])
	{

	List<Integer> nums=Arrays.asList(2000,2014,2012,2011);
	 
	 nums.stream().filter((i)->((i%4==0 && i%100!=0) || i%400==0)).forEach(leap->System.out.println(leap));

	 

		

	}

}
