package designpattern.builder;

import java.util.ArrayList;

public class BmwBuilder extends AbstractCarBuilder {

	private BmwModel bmw = new BmwModel();
	
	@Override
	public void setSequence(ArrayList<String> seq) {
		// TODO Auto-generated method stub
		this.bmw.setSequence(seq);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;
	}

}
