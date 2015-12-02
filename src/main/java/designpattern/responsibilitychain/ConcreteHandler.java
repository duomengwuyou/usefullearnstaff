package designpattern.responsibilitychain;

public class ConcreteHandler extends Handle {

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if(this.getSuccessor() != null){
			System.out.println("转发给下一个用户~");
			this.getSuccessor().handleRequest();
		}else{
			System.out.println("处理请求");
		}
	}

}
