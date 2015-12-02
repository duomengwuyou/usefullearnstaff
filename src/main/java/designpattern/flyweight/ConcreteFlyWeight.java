package designpattern.flyweight;

public class ConcreteFlyWeight implements FlyWeight {

	private String instate;
	
	public ConcreteFlyWeight(String param){
		this.instate = param;
	}
	
	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("IN :"+this.instate);
		System.out.println("Out:"+state);
	}

}
