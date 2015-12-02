package designpattern.strategy;

/**
 * 个人感觉策略模式就是不同的策略实现相同的接口，然后在Context里面复制不同的策略，就会执行不同的方法
 * http://yangguangfu.iteye.com/blog/815107
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyInterface s1 = new StrategyOne();
		StrategyInterface s2 = new StrategyTwo();
		
		
		Context c = new Context(s1);
		c.operate();
	}

}
