package designpattern.bridge;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/05/07/2480938.html
 * 桥梁模式的用意是“将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化”。
 * 强关联和弱关联，继承就是强关联；而聚合关系属于弱关联。
 * 
 * 短信的发送方式有两种，通过统一的接口来规范。
 * 
 * 短信种类有两种，通过抽象类规范子类的行为。
 * 
 * 桥梁模式就是通过把原来的继承现在通过组合来实现。其实完全可以通过集成的方式来实现。
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageImplementor impone = new MessageImplementorOne();
		MessageImplementor imptwo = new MessageImplementorTwo();
		
		AbstractMessage realOne = new CommonMessage(impone);
		realOne.sendMessge("xinglong", "love tingting");
		
		AbstractMessage realTwo = new UrgencyMessage(imptwo);
		realTwo.sendMessge("songli", "love zhouyu");
	}

}
