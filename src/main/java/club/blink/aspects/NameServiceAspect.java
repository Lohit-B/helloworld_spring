package club.blink.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component  
@Aspect
public class NameServiceAspect {

//	@Around("execution(* club.blink.controller.NameServiceController.getName(..))")
//	private Object getNameJoinPoint(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("GET NAME CALLED");
//		System.out.println(pjp.getTarget().getClass());
//		System.out.println(String.valueOf(pjp.getArgs()));
//
//		Object retVal = pjp.proceed();
//		System.out.println("GET NAME Returned");
//		return retVal;
//	}
}
