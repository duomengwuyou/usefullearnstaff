package designpattern.visitor;

public class NodeB extends Node {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	
	public String operateB(){
		System.out.println("NodeB operation");
		return "NodeB";
	}

}
