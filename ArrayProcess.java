package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayProcess {

	
	/**
	 * Time complexity =  WORST - 0(n2)
	 * Space complexity  -> MAX - 0(n) min- O(1)
	 * @param a
	 */
	public static void removeDuplicate(int[] a){

		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int val:a){
			if(!list.contains(val)){
				list.add(val);
			}
		}

		System.out.println(list);	
	}
	
	
	public static void removeDuplicateUsingJava8(int[] a){
      Arrays.stream(a).distinct().forEach(i-> System.out.println(i));
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,3,6,7,8,9};

		//removeDuplicate(a);
		removeDuplicateUsingJava8(a);

	}

}
