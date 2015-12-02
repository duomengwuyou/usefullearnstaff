package designpattern.facade;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/05/02/2478101.html
 * 门面模式是对象的结构模式，外部与一个子系统的通信必须通过一个统一的门面对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。
 * 
 * 门面模式就是把一部分功能暴露出去 
 * 
 * 在tomcat里面request.getRequest（）就是把自己的门面模式对象发送给调用者。
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeModule fm = new FacadeModule();
		fm.a1();
		fm.b2();
	}

}
