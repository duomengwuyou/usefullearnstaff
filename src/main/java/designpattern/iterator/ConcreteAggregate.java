package designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

	List list = null;
	
	public ConcreteAggregate(){
		this.list = new ArrayList();
	}
	
	@Override
	public IteratorInterface iterator() {
		// TODO Auto-generated method stub
		return new ConcreteInterator(this.list);
	}

	@Override
	public void add(Object item) {
		// TODO Auto-generated method stub
		this.list.add(item);
	}

	@Override
	public void remove(Object item) {
		// TODO Auto-generated method stub
		this.list.remove(item);
	}

}
