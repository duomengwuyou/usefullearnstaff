package designpattern.decorator;

public class ConcreteDecoratorB extends Decorator {
	
	public void operate(){
		addBehavior();
		super.operate();
	}
	
	public void addBehavior(){
		System.out.println("add behavior function B");
	}
}
