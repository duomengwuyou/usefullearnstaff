package designpattern.builder;

/**
 * 建造者模式也是通过一定的集成和封装实现的
 * 
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 CarModel bzM = new BenzeModel();
//		 CarModel bmwM = new BmwModel();
		
		//BenzeBuilder benze = new BenzeBuilder();
		
		Director d = new Director();
		d.getAbenzeModel().run();
		d.getBzenzeModel().run();
		 
	}

}
