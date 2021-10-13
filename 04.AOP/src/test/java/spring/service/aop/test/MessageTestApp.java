package spring.service.aop.test;

import spring.service.aop.Message;
import spring.service.aop.impl.MessageImpl;

/*
 * FileName : MessageTestApp.java
 * ::Message / MessageImpl 를 사용하는 Application
 */
public class MessageTestApp {

	///Main
	public static void  main(String[] args) throws Exception {
		
		Message message = new MessageImpl();
		//message 라는 인터페이스로 messageImpl을 사용
		System.out.println("==============================");
		message.setMessage("Hello");
		//인자값 String으로 정보 입력
		System.out.println("==============================");
		String messageValue = message.getMessage();
		//getMessage로 데이터를 받아와서 messageValue에 담는다 그때 getMessage에
		//있는 Hi 정보를 받아서 return한다.
		System.out.println("==============================");
	    
		System.out.println("\n리턴 받은 메세지 : "+messageValue);
		//Hi 와 Hello가 붙어서 출력이 된다.
	    
	}
}//end of class

/* 	
 * [고려할 사항]
 * :: Method 실행 전 무언가를 하고 싶다면...
 * :: Method 실행 후 무언가를 하고 싶다면...
 */