package designpattern.flyweight;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/04/26/2468499.html
 * ��Ԫģʽ�Ƕ���Ľṹģʽ����Ԫģʽ�Թ���ķ�ʽ��Ч��֧�ִ�����ϸ���ȶ���
 * Java�����String���ǲ��õ���Ԫģʽ
 *
 *	ͨ��һ�������࣬�ڸ�����ͨ��һ��map��¼ס���е�string��Ӧ�Ķ���Ȼ�󵱻�ȡ��ͬ��string�Ķ������ͬһ��������ÿ�������Ĵ�����������ǲ�һ���ġ�
 *
 *	���и�����Ԫģʽ����ʵ����ֱ��ͨ������ģʽʵ�ֵ���Ԫģʽ��
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyWeightFactory factory = new FlyWeightFactory();
		//���ж���a�Ͷ���c��ͬһ������
		FlyWeight a = factory.factory("a");
		a.operation("a param");
		
		FlyWeight b = factory.factory("b");
		b.operation("b param");
		
		FlyWeight c = factory.factory("a");
		c.operation("c param");
	}

}
