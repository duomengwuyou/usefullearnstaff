package designpattern.flyweight;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/04/26/2468499.html
 * 享元模式是对象的结构模式。享元模式以共享的方式高效地支持大量的细粒度对象。
 * Java里面的String就是采用的享元模式
 *
 *	通过一个工厂类，在该类中通过一个map记录住所有的string对应的对象。然后当获取相同的string的对象就是同一个。但是每个方法的传入参数可以是不一样的。
 *
 *	还有复合享元模式，其实就是直接通过复合模式实现的享元模式。
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyWeightFactory factory = new FlyWeightFactory();
		//其中对象a和对象c是同一个对象
		FlyWeight a = factory.factory("a");
		a.operation("a param");
		
		FlyWeight b = factory.factory("b");
		b.operation("b param");
		
		FlyWeight c = factory.factory("a");
		c.operation("c param");
	}

}
