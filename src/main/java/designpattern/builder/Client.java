package designpattern.builder;

/**
 * ������ģʽҲ��ͨ��һ���ļ��ɺͷ�װʵ�ֵ�
 * 
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 CarModel bzM = new BenzeModel();
//		 CarModel bmwM = new BmwModel();
		
		//BenzeBuilder benze = new BenzeBuilder();
		
		Director d = new Director();
		d.getAbenzeModel().run();
		d.getBzenzeModel().run();
		 
	}

}
