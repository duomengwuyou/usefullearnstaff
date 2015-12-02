package designpattern.responsibilitychain;

/**
 * 
 * 责任链模式和装饰者模式都差不多，其实就是在同类中操作其他同类时增加其他方法。
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
