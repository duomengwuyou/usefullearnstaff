package designpattern.abstractfactory;

public class MaleHumanFactory implements HumanFactory {

	@Override
	public Human createYellow() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhite() {
		// TODO Auto-generated method stub
		return new MaleWhiteHuman();
	}

}
