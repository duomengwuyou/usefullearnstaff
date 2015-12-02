package designpattern.template;

public abstract class AbstractCarTemplate {
	//基本方法
	public abstract void start();
	public abstract void end();
	
	//模板方法
	public void test(){
		this.start();
		this.end();
	}
}
