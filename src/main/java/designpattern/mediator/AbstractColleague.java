package designpattern.mediator;

/**
 * ����ͬ���࣬����������ͬ�£�ʼ�ձ���B�����num��A����num��10����ϵ
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
