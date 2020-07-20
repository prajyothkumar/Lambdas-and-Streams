package com.epam.LambdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class StartWitha {

	public static void main(String[] args) {
      List<String> list=Arrays.asList("jani","abc","sam","candy","anju","aaa","sanju");
      List<String> l1=list.stream().filter(str->str.startsWith("a")&&str.length()==3).collect(Collectors.toList());
      System.out.println("Strings starting with 'a' with length 3");
      l1.forEach(System.out::println);
	}

}
