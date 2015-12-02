package designpattern.command;

public class ConcreteCommand implements Command {

	public Receiver r;

	public Receiver getR() {
		return r;
	}

	public void setR(Receiver r) {
		this.r = r;
	}
	
	public ConcreteCommand(Receiver paramR){
		this.r = paramR;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.r.action();
	}

}
