package designpattern.template;

/**
 * ģ�巽����http://www.cnblogs.com/cbf4life/archive/2010/01/05/1639487.html
 * 
 * ģ�巽ʽ��ͨ������������ģ�巽���������ġ�������ʽ����ÿһ�����඼Ҫӵ�еķ�����ģ�巽ʽ�ǹ����ķ��������Ե���ÿһ������������
 * 
 * ������~���Բ���ʵ�֣����ֳ���
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
