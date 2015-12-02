package designpattern.visitor;

public class VisitorB implements Visitor {

	@Override
	public void visit(NodeA n) {
		// TODO Auto-generated method stub
		n.operateA();
	}

	@Override
	public void visit(NodeB n) {
		// TODO Auto-generated method stub
		n.operateB();
	}

}
