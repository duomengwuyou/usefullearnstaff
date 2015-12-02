package designpattern.decorator;

/**
 * 装饰者实现组件接口   实现operate函数
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
