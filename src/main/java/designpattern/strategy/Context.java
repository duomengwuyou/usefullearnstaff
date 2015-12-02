package designpattern.strategy;


public class Context {

	public StrategyInterface strategy;
	
	public Context(StrategyInterface s){
		this.strategy = s;
	}
	
	public void operate(){
		this.strategy.operate();
	}
}
