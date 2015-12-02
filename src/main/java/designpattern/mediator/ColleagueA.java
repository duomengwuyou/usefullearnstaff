package designpattern.mediator;

public class ColleagueA extends AbstractColleague {

	@Override
	public void setNum(int paraNum, AbstractMediator am) {
		// TODO Auto-generated method stub
		this.num = paraNum;
		am.aAffectB();
	}

}
