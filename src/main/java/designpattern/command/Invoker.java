package designpattern.command;

public class Invoker {
	
	public Command c;
	
	public Invoker(Command paramC){
		this.c = paramC;
	}
	
	public void runCommand(){
		this.c.execute();
	}
	
}
