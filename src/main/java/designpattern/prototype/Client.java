package designpattern.prototype;

/**
 * 原型模式主要是通过通过实现cloneable函数来实现的。然后实现里面的clone函数就可以了
 * 
 * 原型模式的优点就是直接在内存里面进行操作，比较快速；而且多线程也是安全的。
 * 
 * 在拷贝函数执行的时候是不会调用构造函数的。这是因为clone操作是直接在内存里面实现了拷贝，
 * 
 * 还有深拷贝和浅拷贝问题，有些引用类型在clone的时候就是简单的浅拷贝，所以这个一点还是挺危险的。需要做深拷贝。
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrototypeClass pc = new PrototypeClass();
		pc.s = "pc.s";
		PrototypeClass pb = pc.clone();
		pb.s = "pb.s";
		pb.finalList.add("hello");
		System.out.println(pc.finalList.size()+" "+pb.finalList.size());
	}

}
