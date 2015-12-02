package designpattern.decorator;

/**
 * 1. 多用组合，少用继承。
	利用继承设计子类的行为，是在编译时静态决定的，而且所有的子类都会继承到相同的行为。然而，如果能够利用组合的做法扩展对象的行为，就可以在运行时动态地进行扩展。
   2. 类应设计的对扩展开放，对修改关闭。 
 *
 * 装饰组件和被装饰组件都是实现同一个接口，拥有相同的方法。只是在装饰者里面包含了一个组件对象，在调用组件方法的时候，在前后可以增加其他方法。
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component cc  = new ConcreteComponent();
		Decorator da = new ConcreteDecoratorA();
		Decorator db = new ConcreteDecoratorB();
		
		da.setC(db);
		db.setC(cc);
		
		da.operate();
	}

}
