package spring.service.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PojoAspectJ {
	
	
	public void PojoAspectJ() {
		System.out.println(":: PojoAspectJ Default Cosntructor");
	}
	
//	@Pointcut("execution(**.getMessage(..))")
//	public void work() {
//		System.out.println("work() pointcut call........");
//	}
	
	public void before(JoinPoint joinPoint) {
		System.out.println("[before LOG]"+getClass()+"before() start....");
		System.out.println("[before LOG] 타겍 객체 :"+joinPoint.getTarget().getClass().getName());
		System.out.println("[before LOG] 타겍 객체의 호출될 method :"+joinPoint.getSignature().getName());
		
		if(joinPoint.getArgs().length != 0) {
			System.out.println("[before LOG] 타겍 객체의 호출할 method에 전달되는 인자 :"+joinPoint.getArgs()[0]);
		}
		System.out.println("[before LOG]"+getClass()+"before() end...");
	}
	
	public void afterReturning (JoinPoint joinPoint,Object returnValue) {

		System.out.println("[after LOG]"+getClass()+"afterReturning() start....");
		System.out.println("[after LOG] 타겍 객체 :"+joinPoint.getTarget().getClass().getName());
		System.out.println("[after LOG] 타겟 객체의 호출된 method :"+joinPoint.getSignature().getName());
		System.out.println("[after LOG] 타겟 객체의 호출후 return value :"+returnValue);
		System.out.println("[after LOG]"+getClass()+"afterReturning() end...");
	}

	
	public Object invoke(ProceedingJoinPoint joinPoint)throws Throwable{
		
		System.out.println("[Around before]"+getClass()+".invoke() start....");
		System.out.println("[Around before] 타겍 객체 :"+joinPoint.getTarget().getClass().getName());
		System.out.println("[Around before] 타겍 객체의 호출 될 method :"+joinPoint.getSignature().getName());
		
		if(joinPoint.getArgs().length != 0) {
			System.out.println("[Around before] 타겟 객체의 호출할 method에 전달되는 인자:"+joinPoint.getArgs()[0]);
		}
		Object obj = joinPoint.proceed();
		
		System.out.println("[Around before] 타겟 객체의 호출후 return value :"+obj);
		System.out.println("[Around before]"+getClass()+".invoke() end...");

		return obj;
	}
	public void afterThrowing(JoinPoint joinPoint,Throwable throwable) {
		
		System.out.println("[exception]"+getClass()+"afterThrowing() start....");
		System.out.println("[exception] 타겍 객체 :"+joinPoint.getTarget().getClass().getName());
		System.out.println("[exception] 타겍 객체의 호출된 method :"+joinPoint.getSignature().getName());
		System.out.println("[exception] Exception 발생...");
		System.out.println("[exception] Exception Message :"+throwable.getMessage());
		System.out.println("[exception]"+getClass()+"afterThrowing() end...");

	}
}
