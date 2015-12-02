package designpattern.template;

/**
 * 模板方法：http://www.cnblogs.com/cbf4life/archive/2010/01/05/1639487.html
 * 
 * 模板方式是通过基本方法和模板方法来构建的。基本方式就是每一个子类都要拥有的方法，模板方式是公共的方法，可以调用每一个基本方法。
 * 
 * 抽象类~可以部分实现，部分抽象。
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCarTemplate carone = new ConcreteCarOne();
		AbstractCarTemplate cartwo = new ConcreteCarTwo();
		
		carone.test();
		cartwo.test();
	}

}
