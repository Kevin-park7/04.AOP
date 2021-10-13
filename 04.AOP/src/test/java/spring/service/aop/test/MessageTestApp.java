package spring.service.aop.test;

import spring.service.aop.Message;
import spring.service.aop.impl.MessageImpl;

/*
 * FileName : MessageTestApp.java
 * ::Message / MessageImpl �� ����ϴ� Application
 */
public class MessageTestApp {

	///Main
	public static void  main(String[] args) throws Exception {
		
		Message message = new MessageImpl();
		//message ��� �������̽��� messageImpl�� ���
		System.out.println("==============================");
		message.setMessage("Hello");
		//���ڰ� String���� ���� �Է�
		System.out.println("==============================");
		String messageValue = message.getMessage();
		//getMessage�� �����͸� �޾ƿͼ� messageValue�� ��´� �׶� getMessage��
		//�ִ� Hi ������ �޾Ƽ� return�Ѵ�.
		System.out.println("==============================");
	    
		System.out.println("\n���� ���� �޼��� : "+messageValue);
		//Hi �� Hello�� �پ ����� �ȴ�.
	    
	}
}//end of class

/* 	
 * [����� ����]
 * :: Method ���� �� ���𰡸� �ϰ� �ʹٸ�...
 * :: Method ���� �� ���𰡸� �ϰ� �ʹٸ�...
 */