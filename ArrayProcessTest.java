package test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ArrayProcessTest {
	 

	@Test
	public void testArrayProcess(){
		int a[]={1,2,4,4,5,6,6};
		ArrayList<Integer> distinctList= new ArrayList<Integer>();
	     distinctList.add(1);
	     distinctList.add(2);
	     distinctList.add(4);
	     distinctList.add(5);
	     distinctList.add(6);
	     
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int val:a){
			if(!list.contains(val)){
				list.add(val);
			}
		}
	    assertNotNull(list);
	    assertequals(distinctList,list);
		
	}
	@Test
	public  void removeDuplicateUsingJava8(int[] a){
	     
		List<Integer> list= Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
	     assertNotNull(list);
	     ArrayList<Integer> distinctList= new ArrayList<Integer>();
	     distinctList.add(1);
	     distinctList.add(2);
	     distinctList.add(4);
	     distinctList.add(5);
	     distinctList.add(6);
	     assertequals(distinctList,list);
		}
	
}
