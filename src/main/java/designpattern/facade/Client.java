package designpattern.facade;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/05/02/2478101.html
 * ����ģʽ�Ƕ���Ľṹģʽ���ⲿ��һ����ϵͳ��ͨ�ű���ͨ��һ��ͳһ�����������С�����ģʽ�ṩһ���߲�εĽӿڣ�ʹ����ϵͳ������ʹ�á�
 * 
 * ����ģʽ���ǰ�һ���ֹ��ܱ�¶��ȥ 
 * 
 * ��tomcat����request.getRequest�������ǰ��Լ�������ģʽ�����͸������ߡ�
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeModule fm = new FacadeModule();
		fm.a1();
		fm.b2();
	}

}
