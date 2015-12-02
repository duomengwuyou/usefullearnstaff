package designpattern.decorator;

/**
 * װ����ʵ������ӿ�   ʵ��operate����
 *
 */
public class Decorator implements Component {
	
	public Component c;

	public Component getC() {
		return c;
	}

	public void setC(Component c) {
		this.c = c;
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.c.operate();
	}

}
