package designpattern.bridge;

/**
 * �������е��ø���ķ���   ���ù��캯�������ڿ���new
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
