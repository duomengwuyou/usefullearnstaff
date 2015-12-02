package designpattern.iterator;

/**
 * 迭代器模式就是为集合类里面的数据访问提供了一种统一的接口，
 * 
 * 集合类里面不提供直接访问数据的方式，而是通过iterator里面来做。
 * 
 * 迭代器和集合是相辅相成的。
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregate a = new ConcreteAggregate();
		a.add(1);
		a.add("long");
		
		IteratorInterface ite = a.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}
