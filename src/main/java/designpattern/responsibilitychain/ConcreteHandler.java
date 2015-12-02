package designpattern.responsibilitychain;

public class ConcreteHandler extends Handle {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if(this.getSuccessor() != null){
			System.out.println("ת������һ���û�~");
			this.getSuccessor().handleRequest();
		}else{
			System.out.println("��������");
		}
	}

}
