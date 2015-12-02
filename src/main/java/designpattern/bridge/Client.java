package designpattern.bridge;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/05/07/2480938.html
 * ����ģʽ�������ǡ�������(Abstraction)��ʵ�ֻ�(Implementation)���ʹ�ö��߿��Զ����ر仯����
 * ǿ���������������̳о���ǿ���������ۺϹ�ϵ������������
 * 
 * ���ŵķ��ͷ�ʽ�����֣�ͨ��ͳһ�Ľӿ����淶��
 * 
 * �������������֣�ͨ��������淶�������Ϊ��
 * 
 * ����ģʽ����ͨ����ԭ���ļ̳�����ͨ�������ʵ�֡���ʵ��ȫ����ͨ�����ɵķ�ʽ��ʵ�֡�
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageImplementor impone = new MessageImplementorOne();
		MessageImplementor imptwo = new MessageImplementorTwo();
		
		AbstractMessage realOne = new CommonMessage(impone);
		realOne.sendMessge("xinglong", "love tingting");
		
		AbstractMessage realTwo = new UrgencyMessage(imptwo);
		realTwo.sendMessge("songli", "love zhouyu");
	}

}
