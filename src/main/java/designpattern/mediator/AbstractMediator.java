package designpattern.mediator;

/**
 * �����н��ߣ�ͨ���н��߸ı�����ͬ�����ݵĹ�ϵ
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
