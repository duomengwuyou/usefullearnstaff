package designpattern.adapter;

/**
 * ���ȣ�����һ����׼�Ľӿڣ�Ҳ�����û����뿴���Ľӿڼ������Ȼ������ʵ�������������ת������Ȼ���ڷ����е��ô�ת����ķ�����ǰ�����һЩ�������Ӷ�ʵ���˷�װ��Ч����
 * 
 * ������ģʽ���ǰ�ԭ���ķ���ǰ���װһЩ�µķ�����
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PS2Port ps2 = new ConcretePS2port();
		UsbPort object = new PS2toUSB(ps2);
		object.USBwork();
	}

}
