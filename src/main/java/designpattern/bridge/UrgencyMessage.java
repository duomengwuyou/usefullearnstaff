package designpattern.bridge;

/**
 * 在子类中调用父类的方法   调用构造函数不等于可以new
 * @author Administrator
 *
 */
public class UrgencyMessage extends AbstractMessage {

	
	public UrgencyMessage(MessageImplementor param) {
		super(param);
		// TODO Auto-generated constructor stub
	}
	
	public void sendMessge(String user, String message){
		super.sendMessge(user, message);
	}

}
