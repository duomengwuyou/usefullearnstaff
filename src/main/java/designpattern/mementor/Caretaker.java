package designpattern.mementor;

/**
 * 负责人类
 * @author Administrator
 *
 */
public class Caretaker {
	private Mementor m = null;

	public Mementor getM() {
		return m;
	}

	public void setM(Mementor m) {
		this.m = m;
	}
	
}
