package designpattern.mediator;

/**
 * �н���ģʽ����ͨ��һ���н���������ͬ��֮�����ݵĴ��䡣��ôÿһ��ͬ�¶�����һ���н��ߣ��н�������ÿһ��ͬ�¡�Ȼ��ͬ��ί���н���ȥ������������
 * 
 * ��ʵ����ͨ������ʵ���������ת�ơ�
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractColleague a = new ColleagueA();
		AbstractColleague b = new ColleagueB();
		
		AbstractMediator am = new ConcreteMediator(a, b);
		
		//ͨ������a�ı�b
		a.setNum(10, am);
		System.out.println(a.getNum()+" "+b.getNum());
		
		//ͨ������b�ı�a
		b.setNum(1000, am);
		System.out.println(a.getNum()+" "+b.getNum());
	}

}
