package designpattern.iterator;

/**
 * ������ģʽ����Ϊ��������������ݷ����ṩ��һ��ͳһ�Ľӿڣ�
 * 
 * ���������治�ṩֱ�ӷ������ݵķ�ʽ������ͨ��iterator����������
 * 
 * �������ͼ������ศ��ɵġ�
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregate a = new ConcreteAggregate();
		a.add(1);
		a.add("long");
		
		IteratorInterface ite = a.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}
