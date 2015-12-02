package designpattern.mediator;

/**
 * 抽象中介者，通过中介者改变两个同事数据的关系
 *	
 *
 */
public abstract class AbstractMediator {
	protected AbstractColleague a;
	protected AbstractColleague b;
	
	
	public AbstractMediator(AbstractColleague paramA, AbstractColleague paramB){
		this.a = paramA;
		this.b = paramB;
	}
	
	public abstract void aAffectB();
	public abstract void bAffectA();
}
