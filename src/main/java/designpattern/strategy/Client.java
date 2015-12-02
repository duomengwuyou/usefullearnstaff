package designpattern.strategy;

/**
 * ���˸о�����ģʽ���ǲ�ͬ�Ĳ���ʵ����ͬ�Ľӿڣ�Ȼ����Context���渴�Ʋ�ͬ�Ĳ��ԣ��ͻ�ִ�в�ͬ�ķ���
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
