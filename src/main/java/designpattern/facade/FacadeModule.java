package designpattern.facade;

/**
 * ����ģʽ  ͨ�����������ģ��ķ���
 * @author Administrator
 *
 */
public class FacadeModule {
	ModuleA ma = new ModuleA();
	ModuleB mb = new ModuleB();
	
	public void a1(){
		ma.a1();
	}
	
	public void b2(){
		mb.b2();
	}
}
