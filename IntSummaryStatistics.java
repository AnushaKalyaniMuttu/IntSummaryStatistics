package com.bean;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class IntSummaryStatistics{
		     public static void main(String[] args) {
		    	 
		    	 List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		    	 IntSummaryStatistics stats = list.stream() .mapToInt((x) -> x) .summaryStatistics();
		    	 System.out.println(stats.getAverage());
		    	 System.out.println(stats.getCount());
		    	 System.out.println(stats.getMax());
		    	 System.out.println(stats.getMin());
		    	 System.out.println(stats.getSum());
		     }
		     }
