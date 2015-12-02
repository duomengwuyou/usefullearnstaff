package designpattern.responsibilitychain;

/**
 * ������  �涨ÿ������Ӧ�õķ���  successor����ָ����������һ��ִ����
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
