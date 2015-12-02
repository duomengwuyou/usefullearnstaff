package designpattern.mediator;

public class ConcreteMediator extends AbstractMediator {

	public ConcreteMediator(AbstractColleague paramA, AbstractColleague paramB) {
		super(paramA, paramB);
		// TODO Auto-generated constructor stub
		this.a = paramA;
		this.b = paramB;
	}

	@Override
	public void aAffectB() {
		// TODO Auto-generated method stub
		this.b.setNum(this.a.getNum()*10);
	}

	@Override
	public void bAffectA() {
		// TODO Auto-generated method stub
		this.a.setNum(this.b.getNum()/10);
	}

}
