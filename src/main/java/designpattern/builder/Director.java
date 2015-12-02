package designpattern.builder;
import java.util.ArrayList;

public class Director {
	private ArrayList<String> seq = new ArrayList<String>();
	
	BenzeBuilder benzeb = new BenzeBuilder();
	BmwBuilder bmwb = new BmwBuilder();
	
	public CarModel getAbenzeModel(){
		this.seq.clear();
		this.seq.add("start");
		this.seq.add("alarm");
		this.seq.add("end");
		this.benzeb.setSequence(seq);
		return this.benzeb.getCarModel();
	}
	
	public CarModel getBzenzeModel(){
		this.seq.clear();
		this.seq.add("start");
		this.seq.add("end");
		this.seq.add("alarm");
		this.benzeb.setSequence(seq);
		return this.benzeb.getCarModel();
	}
	
	public CarModel getBmwModel(){
		this.seq.clear();
		this.seq.add("start");
		this.seq.add("end");
		this.seq.add("alarm");
		this.bmwb.setSequence(seq);
		return this.bmwb.getCarModel();
	}
}
