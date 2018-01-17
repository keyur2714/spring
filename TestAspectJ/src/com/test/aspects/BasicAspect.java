package com.test.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
 
@Aspect
public class BasicAspect {
 
	@Before("execution(* com.test.object.*.setName*(..))")
    public void beforeSetName() {
        System.out.println("Before SetName Called");
    }
	
	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing Advice on getName() Method");
	}
	
	@Before("   call(void java.io.PrintStream.println(String)) " +
            "&& !within(com.test.aspects..*)")
    public void beforePrintlnCall() {
        System.out.println("About to make call to print Hello World");
    }
 
}