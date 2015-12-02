package designpattern.bridge;

public abstract class AbstractMessage {
	
	private MessageImplementor mImplementor;
	
	public AbstractMessage(MessageImplementor param){
		this.mImplementor = param;
	}
	
	public void sendMessge(String user, String message){
		this.mImplementor.send(user, message);
	}
	
}
