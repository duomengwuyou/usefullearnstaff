package designpattern.factory;

/**
 * 工厂方法就是通过传递。class来实现的。Class.forName().newInstance()是关键。
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractHumanFactory factory = new HumanFactory();
		Human whiteHuman = factory.createHuman(WhiteHuman.class);
		whiteHuman.talk();
		whiteHuman.color();
		
	}

}
