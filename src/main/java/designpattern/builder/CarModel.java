package designpattern.builder;
import java.util.ArrayList;
public abstract class CarModel {
	
	public abstract void start();
	public abstract void end();
	public abstract void alarm();
	
	private ArrayList<String> sequence = new ArrayList<String>();
	
	final public void run(){
		int seqSize = sequence.size();
		for(int i = 0; i < seqSize; i++){
			String operate = sequence.get(i);
			switch(operate){
				case "start":
					this.start();
					break;
				case "end":
					this.end();
					break;
				case "alarm":
					this.alarm();
					break;
			}
		}
	}
	
	final public void setSequence(ArrayList<String> seq){
		this.sequence = seq;
	}
}
