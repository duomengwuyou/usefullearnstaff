package designpattern.bridge;

public class MessageImplementorOne implements MessageImplementor {

	@Override
	public void send(String user, String message) {
		// TODO Auto-generated method stub
		System.out.println("Implementor One: send"+message+" to "+user);
	}

}
