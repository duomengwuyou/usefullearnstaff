package designpattern.responsibilitychain;

/**
 * 
 * ������ģʽ��װ����ģʽ����࣬��ʵ������ͬ���в�������ͬ��ʱ��������������
 * http://www.cnblogs.com/java-my-life/archive/2012/05/28/2516865.html
 *
 */
public class Client {
	
	public static void main(String[] args){
		Handle one = new ConcreteHandler();
		Handle two = new ConcreteHandler();
		Handle three = new ConcreteHandler();
		
		one.setSuccessor(two);
		two.setSuccessor(three);
		one.handleRequest();
	}
}
