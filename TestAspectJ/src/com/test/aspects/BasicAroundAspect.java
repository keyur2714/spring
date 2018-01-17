package com.test.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class BasicAroundAspect {
	
	
	@Around("execution(* com.test.object.*.setName(..))")
	public void logAroundSetName(ProceedingJoinPoint pjp) throws Throwable
    {
		Signature signature = pjp.getSignature();
		
		String methodName = signature.getName();
		
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Method:: "+methodName + "Execution Start");
        
		try {
			System.out.println("hijacked arguments : " + Arrays.toString(pjp.getArgs()));
			Object object = pjp.proceed(new Object[] {"denish"});
			System.out.println(object+" ===");
		} catch (Throwable e) {
			e.printStackTrace();
		} 
		long endTime = System.currentTimeMillis();
		System.out.println("Method:: "+methodName + "Execution End");
		System.out.println("Method:: "+methodName + "Execution Time is: "+(endTime - startTime));
    }
	
	@AfterReturning(
    pointcut="execution(* com.test.object.*.getName())", 
    returning="returnValue")
    public void runAfter(JoinPoint joinPoint, String returnValue) throws Throwable {
         
        System.out.println("Inside RunAfterExecution.afterReturning() method...");
        System.out.println("inserted after : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + returnValue.toUpperCase());
        returnValue = returnValue.toUpperCase();
    }
	
	@Around(
			"execution(* com.test.object.*.getName(..))"
    )
    public String logAroundGetName(ProceedingJoinPoint pjp) throws Throwable {
		Object object = null; 
        System.out.println("Inside RunAfterExecution.afterReturning() method...");
        System.out.println("inserted after : " + pjp.getSignature().getName());
        try {
			System.out.println("hijacked arguments : " + Arrays.toString(pjp.getArgs()));
			object = pjp.proceed();
			System.out.println(object+" ===");
			object = object.toString().toUpperCase();
		} catch (Throwable e) {
			e.printStackTrace();
		} 
        return object.toString();
    }
}
