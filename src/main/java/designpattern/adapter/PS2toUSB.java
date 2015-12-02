package designpattern.adapter;

public class PS2toUSB implements UsbPort {

	private PS2Port ps2portObject;
	
	public PS2toUSB(PS2Port ps2){
		this.ps2portObject = ps2;
	}
	
	@Override
	public void USBwork() {
		// TODO Auto-generated method stub
		System.out.println("接口转换功能:");
		
		this.ps2portObject.ps2Work();
		
		System.out.println("USB port is working");
	}

}
