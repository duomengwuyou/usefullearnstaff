package designpattern.state;

public class Context {

	public int count = 0;
	
	private StateInterface state;
	
	public void operate(){
		if(count >= 0 && count < 5){
			state  = new StateOne();
		}else{
			state = new StateTwo();
		}
		
		state.operate("param", this);
	}
}
