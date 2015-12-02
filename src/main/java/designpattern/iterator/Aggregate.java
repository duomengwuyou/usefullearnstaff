package designpattern.iterator;

public interface Aggregate {
	public IteratorInterface iterator();
	
	public void add(Object item);
	
	public void remove(Object item);
}	
