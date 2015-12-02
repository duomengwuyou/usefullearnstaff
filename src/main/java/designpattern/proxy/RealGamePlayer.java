package designpattern.proxy;

public class RealGamePlayer implements GamePlayer {

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Real login");
	}

	@Override
	public void killboss() {
		// TODO Auto-generated method stub
		System.out.println("Real killboss");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("Real upgrade");
	}

}
