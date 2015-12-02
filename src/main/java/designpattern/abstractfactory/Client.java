package designpattern.abstractfactory;

/**
 * 
 * ��ʽ�͹��̷�����ֻ࣬����ζ����Ա���һ���ͨ��һ��������ʵ��һ���ӿڣ�Ȼ���þ������ȥ������������ࡣ
 * 
 * Ȼ���ڹ��̽ӿڶ���÷���������ʵ����ֱ������Ժ�Ů�ԣ�ʵ������ӿڡ�
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
