package designpattern.factory;

/**
 * ������������ͨ�����ݡ�class��ʵ�ֵġ�Class.forName().newInstance()�ǹؼ���
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
