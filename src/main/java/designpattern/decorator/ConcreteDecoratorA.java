package designpattern.decorator;

/**
 * 实际装饰者，在operate方法中，可以增加附属的方法了。
 *
 *
 */
public class ConcreteDecoratorA extends Decorator{

	public void operate(){
		addBehavior();
		super.operate();
	}
	
	public void addBehavior(){
		System.out.println("add behavior function A");
	}
}
