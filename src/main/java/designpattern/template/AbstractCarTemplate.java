package designpattern.template;

public abstract class AbstractCarTemplate {
	//��������
	public abstract void start();
	public abstract void end();
	
	//ģ�巽��
	public void test(){
		this.start();
		this.end();
	}
}
