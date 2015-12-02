package designpattern.bridge;

public class MessageImplementorTwo implements MessageImplementor {

	@Override
	public void send(String user, String message) {
		// TODO Auto-generated method stub
		System.out.println("Implementor Two: send"+message+" to "+user);
	}

}
