package designpattern.state;

public class StateOne implements StateInterface {

	@Override
	public void operate(String param, Context c) {
		// TODO Auto-generated method stub
		System.out.println("StateOne is runint");
		c.count++;
		System.out.println("Current c count:"+c.count);
	}

}
