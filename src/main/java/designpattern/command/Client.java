package designpattern.command;

/**
 * ����ģʽ������ͨ�������Ĺ�ϵ������ֱ��ִ�еķ���ͨ���м�һ��ȥʵ�֡��͸��м��и������Ƶġ�
 * http://www.cnblogs.com/devinzhang/archive/2012/01/06/2315235.html
 * 
 * ������������ӱ��ǵ��ӵĿ����غͻ�̨���ѿ����غͻ�̨�����ɾ�������
 * 
 * Tv�ǽ����ߣ�Ȼ��������������ý����ߵľ��巽����Ȼ������߿�����ң������
 * 
 * ��ô��������ʵ�Ͳ����ж��receiver��������һ�������ʵ�־Ϳ����ˣ�ֻ�ǲ�ͬ�������Ӧ��receiver�����ĳһ��������
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ��ִ���������
		Receiver ra = new ReceiverA();
		Receiver rb = new ReceiverB();
		
		//����  ����������������ִ����
		Command c = new ConcreteCommand(ra);
		
		//������  �����߿��Դ��벻ͬ������
		Invoker iker = new Invoker(c);
		
		iker.runCommand();
	}

}
