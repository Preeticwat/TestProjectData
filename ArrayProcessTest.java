package test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayProcessTest {

	@Test
	public void testArrayProcess(){
		int a[]={1,2,3,4,5,6,3,6,7,8,9};
	     
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int val:a){
			if(!list.contains(val)){
				list.add(val);
			}
		}
	    assertNotNull(list);
		
	}
	
}
