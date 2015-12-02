package designpattern.decorator;

/**
 * 1. ������ϣ����ü̳С�
	���ü̳�����������Ϊ�����ڱ���ʱ��̬�����ģ��������е����඼��̳е���ͬ����Ϊ��Ȼ��������ܹ�������ϵ�������չ�������Ϊ���Ϳ���������ʱ��̬�ؽ�����չ��
   2. ��Ӧ��ƵĶ���չ���ţ����޸Ĺرա� 
 *
 * װ������ͱ�װ���������ʵ��ͬһ���ӿڣ�ӵ����ͬ�ķ�����ֻ����װ�������������һ����������ڵ������������ʱ����ǰ�������������������
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component cc  = new ConcreteComponent();
		Decorator da = new ConcreteDecoratorA();
		Decorator db = new ConcreteDecoratorB();
		
		da.setC(db);
		db.setC(cc);
		
		da.operate();
	}

}
