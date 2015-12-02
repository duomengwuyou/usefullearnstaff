package designpattern.responsibilitychain;

/**
 * 抽象父类  规定每个子类应用的方法  successor用于指定链条的下一个执行者
 * 
 */
public abstract class Handle {
	public Handle successor;

	public Handle getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handle successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest();
}
