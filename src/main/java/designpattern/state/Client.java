package designpattern.state;

/**
 * 
 *	״̬ģʽ�Ͳ���ģʽ�Ĳ�ͬ�����ڣ�״̬ģʽ�Ǹ���Context�����״̬�ı仯�����ò�ͬ��״̬ȥչ�֡�������ģʽ�Ǹ������뻷���еı�����ʲô�����в�ͬ�Ĳ���ʵʩ��
 *
 */
public class Client {
	public static void main(String[] args){
		Context c = new Context();
		
		for(int i = 0; i < 10; i++){
			c.operate();
		}
	}
}
