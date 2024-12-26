package com.ash.karo.devparadise.validator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EnableRestCallLogAspect {
 @Around("@annotation(EnableRestCallLogs)")
 public Object logExecutionTime(ProceedingJoinPoint joinPoint, EnableRestCallLogs enableRestCallLogs) throws Throwable {
     
	 if(enableRestCallLogs.enable()){
	 long initTime = System.currentTimeMillis();
     Object proceed = joinPoint.proceed();
     long executionTime = System.currentTimeMillis() - initTime;
     System.out.println("============================================================================================================");
     System.out.println("Method Signature is : "+joinPoint.getSignature() );
     System.out.println("Method executed in : " + executionTime + "ms");
     System.out.println("Input Request: " + joinPoint.getArgs()[0]);
     System.out.println("Output Response : " + proceed);
     return proceed;
	 } else {
		  Object proceed = joinPoint.proceed();
		  return proceed;
	 }
 }
}
