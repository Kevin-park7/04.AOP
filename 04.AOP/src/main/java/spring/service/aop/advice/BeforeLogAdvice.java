package spring.service.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogAdvice implements MethodBeforeAdvice {
	

	public void before(Method method, Object[] args,Object target) throws Throwable {
		// TODO Auto-generated constructor stub
		System.out.println("\n===================================================");
		System.out.println("[before LOG]"+getClass()+"before() start....");
		System.out.println("[before LOG] tagetObject call Method :"+method);
		if(args.length != 0) {
			System.out.println("[before LOG] tagerObject method ���� argument :"+args[0]);
		}
		System.out.println("[before LOG]"+getClass()+"before() end...");
	}

}
