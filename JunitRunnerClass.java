package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JunitRunnerClass {
	public static void main(String args[]){
	
	Result result= JUnitCore.runClasses(ArrayProcessTest.class);
	if(Failure failer: result.getFailures() ){
		System.out.println(failer.toString());	
	}
	   result.getFailures();
	
	
	}
	   
}
