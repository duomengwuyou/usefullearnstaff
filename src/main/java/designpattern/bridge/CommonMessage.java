package designpattern.bridge;

public class CommonMessage extends AbstractMessage {

	public CommonMessage(MessageImplementor param) {
		super(param);
		// TODO Auto-generated constructor stub
	}

	public void sendMessge(String user, String message){
		super.sendMessge(user, message);
	}
}
