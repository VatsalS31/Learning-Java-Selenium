package introduction;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStream {

	public static void main(String[] args)
	{
		ArrayList<String>names=new ArrayList<String>();
		names.add("Sai");
		names.add("Vivek");
		names.add("Rohit");
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if inter op (filter) returns true
		//we can stream
		
		// count the names
		Long c = names.stream().filter(s->s.startsWith("V")).count();
		System.out.println(c);
		
		// print all the names in arraylist
		//filtering based on condition and then providing action like lenght >4 and printing etc...
		names .stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		
		//print names which have last letter as l  with uppercase
		names .stream().filter(s->s.endsWith("l")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//arraylist to list and using sort function
		List<String>names1=Arrays.asList("Vatsal","Pratyush","Vaibhav","Vishal","Aniket");
		names1.stream().filter(s->s.startsWith("V")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//concating 2 strings (merging)
		Stream<String>newstr=Stream.concat(names.stream(), names1.stream());
		newstr.sorted() .forEach(s->System.out.println(s));
		
		//checking the string is present or not
//		boolean flag=newstr.anyMatch(s->s.equalsIgnoreCase("Adam"));
//		System.out.print(flag);
		//Assert.assertTrue(flag);
		
		//printing unique number from the array and sort the array
		List<Integer>val=Arrays.asList(3,2,2,7,5,1,9,7);//1 2 3 5 7 9
		val.stream().distinct().forEach(s->System.out.print(s+" "));
		List<Integer>li=val.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
		
		
		
	}

}
