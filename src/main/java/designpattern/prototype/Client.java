package designpattern.prototype;

/**
 * ԭ��ģʽ��Ҫ��ͨ��ͨ��ʵ��cloneable������ʵ�ֵġ�Ȼ��ʵ�������clone�����Ϳ�����
 * 
 * ԭ��ģʽ���ŵ����ֱ�����ڴ�������в������ȽϿ��٣����Ҷ��߳�Ҳ�ǰ�ȫ�ġ�
 * 
 * �ڿ�������ִ�е�ʱ���ǲ�����ù��캯���ġ�������Ϊclone������ֱ�����ڴ�����ʵ���˿�����
 * 
 * ���������ǳ�������⣬��Щ����������clone��ʱ����Ǽ򵥵�ǳ�������������һ�㻹��ͦΣ�յġ���Ҫ�������
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrototypeClass pc = new PrototypeClass();
		pc.s = "pc.s";
		PrototypeClass pb = pc.clone();
		pb.s = "pb.s";
		pb.finalList.add("hello");
		System.out.println(pc.finalList.size()+" "+pb.finalList.size());
	}

}
