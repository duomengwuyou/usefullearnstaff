package designpattern.abstractfactory;

/**
 * 
 * 方式和工程方法差不多，只是这次多了性别这一概念。通过一个抽象类实现一个接口，然后用具体的类去集成这个抽象类。
 * 
 * 然后在工程接口定义好方法，两个实体类分别负责男性和女性，实现这个接口。
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanFactory maleFactory = new MaleHumanFactory();
		HumanFactory femaleFactory = new FemaleHumanFactory();
		
		Human ymh = maleFactory.createYellow();
		ymh.talk();
		ymh.getSex();
	}

}
