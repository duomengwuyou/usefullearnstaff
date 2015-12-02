package designpattern.mediator;

/**
 * 抽象同事类，假如有两个同事，始终保持B里面的num是A里面num的10倍关系
 * 
 *
 */
public abstract class AbstractColleague {
	public int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public abstract void setNum(int paraNum,AbstractMediator am);
	
}
