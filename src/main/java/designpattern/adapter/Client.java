package designpattern.adapter;

/**
 * 首先，给出一个标准的接口，也就是用户最想看到的接口及其服务。然后在其实现类里面包含待转换对象，然后在方法中调用待转换类的方法，前后加上一些东西，从而实现了封装的效果。
 * 
 * 适配器模式就是把原来的服务前后封装一些新的方法。
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
