package designpattern.proxy;

public class ProxyGamePlayer implements GamePlayer {

	private GamePlayer gamePlayer = null;
	
	public ProxyGamePlayer(GamePlayer g){
		this.gamePlayer = g;
	}
	
	@Override
	public void login() {
		// TODO Auto-generated method stub
		this.gamePlayer.login();
	}

	@Override
	public void killboss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killboss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
	}

}
