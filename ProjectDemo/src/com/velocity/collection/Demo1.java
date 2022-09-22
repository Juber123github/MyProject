package com.velocity.collection;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
      List<Object > list = Arrays.asList(12,32,3,23,32,32,11,11,11);
      System.out.println(list);
      for(Object i:    list ) {
    	  System.out.println(i);
      }
	}

}
