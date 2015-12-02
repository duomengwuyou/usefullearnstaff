package designpattern.observer;

/**
 * 
 * GoF˵����Observerģʽ����ͼ�ǡ����������һ��һ�Զ��������ϵ����һ�������״̬�����ı�ʱ���������������Ķ��󶼵õ�֪ͨ�����Զ�����
 * 
 * �۲���ģʽ�Ѿ���java����ʵ���ˣ����԰ѹ۲���ģʽ��Ϊ���ģʽ�Ļʺ�
 * 
 * �����ڱ��۲��������ӹ۲��ߣ����۲��߱仯֮��Ϳ���֪ͨ�۲��߱仯��
 * 
 * http://blog.csdn.net/legendmohenote/article/details/5762350
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable  singer = new Observable();
		//���Ӳ���
		singer.addObserver(new ObserverOne());
		singer.addObserver(new ObserverTwo());
		
		singer.change = true;
		singer.notifyObservers("");
	}

}
