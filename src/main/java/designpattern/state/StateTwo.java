package designpattern.state;

public class StateTwo implements StateInterface {

	@Override
	public void operate(String param, Context c) {
		// TODO Auto-generated method stub
		System.out.println("StateTwo is runint");
		c.count++;
		System.out.println("Current c count:"+c.count);
	}

}
