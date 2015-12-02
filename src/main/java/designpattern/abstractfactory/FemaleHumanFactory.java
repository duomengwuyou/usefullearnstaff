package designpattern.abstractfactory;

public class FemaleHumanFactory implements HumanFactory {

	@Override
	public Human createYellow() {
		// TODO Auto-generated method stub
		return new FemaleYellowHuman();
	}

	@Override
	public Human createWhite() {
		// TODO Auto-generated method stub
		return new FemaleYellowHuman();
	}

}
