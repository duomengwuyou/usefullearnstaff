package designpattern.mementor;

/**
 * http://blog.csdn.net/yangyan1990/article/details/5830765
 * http://www.dedecms.com/knowledge/program/jsp-java/2012/0824/13291.html
 * ����¼ģʽ����һ����Ϊ������ģʽ���ڲ��ƻ���װ�Ե�ǰ�������£�����һ��������ڲ�״̬�����ڸĶ���֮�Ᵽ���״̬���Ժ�Ϳ��Խ��ö���ָ�����ǰ�����״̬��
 * 
 * originator�������caretaker   Ȼ��mementor�����״̬��Ϣ  mementor��originator���ڲ���
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o = new Originator();
		o.setState("old state");
		o.createMementor();
		o.setState("new state");
		o.roolBack();
		
	}

}
