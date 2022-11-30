package com.client;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AppAdvice {
	
	
	  @Before(value="execution(* com.service.BankService.service(..))")
	  
	  public void callBefore() { System.out.println("called before any method"); }
	  //After way
	  
	  @After(value="execution(* com.service.BankService.service(..))")
			  public void callBeforeHi() { 
		  System.out.println("After Hi"); }
	 

	/*@Around(value="execution(* com.service.BankService.service(..))")
	public void callAround(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("called before sayHello"+pj.getSignature());
		pj.proceed();
		System.out.println("called after sayHello");
	}*/
}
