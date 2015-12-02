package designpattern.decorator;

/**
 * ʵ��װ���ߣ���operate�����У��������Ӹ����ķ����ˡ�
 *
 *
 */
public class ConcreteDecoratorA extends Decorator{

	public void operate(){
		addBehavior();
		super.operate();
	}
	
	public void addBehavior(){
		System.out.println("add behavior function A");
	}
}
