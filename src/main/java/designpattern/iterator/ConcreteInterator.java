package designpattern.iterator;

import java.util.List;

public class ConcreteInterator implements IteratorInterface {

	//用于记录列表数据
	private List list;
	
	private int cursor = 0;
	
	public ConcreteInterator(List l){
		this.list = l;
	}
	
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object o = null;
		if(hasNext()){
			o = list.get(cursor++);
		}
		return o;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(cursor == this.list.size()){
			return false;
		}
		return true;
	}

}
