package designpattern.visitor;

public class NodeA extends Node {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	
	public String operateA(){
		System.out.println("NodeA operation");
		return "NodeA";
	}

}
