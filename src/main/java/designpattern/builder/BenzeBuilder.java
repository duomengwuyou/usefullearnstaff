package designpattern.builder;

import java.util.ArrayList;

public class BenzeBuilder extends AbstractCarBuilder {
	
	private BenzeModel benze = new BenzeModel();

	@Override
	public void setSequence(ArrayList<String> seq) {
		// TODO Auto-generated method stub
		this.benze.setSequence(seq);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benze;
	}

}
