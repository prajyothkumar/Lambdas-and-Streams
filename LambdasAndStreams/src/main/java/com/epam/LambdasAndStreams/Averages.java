package com.epam.LambdasAndStreams;

	import java.util.Arrays;
	import java.util.List;
	import java.util.OptionalDouble;
	public class Averages {
		public static void main(String[] args){
			List<Integer> l1=Arrays.asList(1,3,7,10,14,23,25);
			OptionalDouble avg= l1.stream().mapToDouble(i->i).average();
			System.out.format("%.2f",avg.getAsDouble());
		}
	}

