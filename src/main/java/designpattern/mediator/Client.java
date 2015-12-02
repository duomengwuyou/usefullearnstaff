package designpattern.mediator;

/**
 * 中介者模式就是通过一个中介者来负责同事之间数据的传输。那么每一个同事都包含一个中介者，中介者中有每一个同事。然后同事委托中介者去做交互操作。
 * 
 * 其实就是通过依赖实现了任务的转移。
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractColleague a = new ColleagueA();
		AbstractColleague b = new ColleagueB();
		
		AbstractMediator am = new ConcreteMediator(a, b);
		
		//通过设置a改变b
		a.setNum(10, am);
		System.out.println(a.getNum()+" "+b.getNum());
		
		//通过设置b改变a
		b.setNum(1000, am);
		System.out.println(a.getNum()+" "+b.getNum());
	}

}
