package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	
	List<Node> nodes = new ArrayList<Node>();
	
	public void add(Node n){
		this.nodes.add(n);
	}
	
	public void action(Visitor v){
		for(Node n : nodes){
			n.accept(v);
		}
	}
	
}
