package designpattern.command;

/**
 * 命令模式，就是通过依赖的关系，对于直接执行的服务通过中间一层去实现。就跟中间有个代理似的。
 * http://www.cnblogs.com/devinzhang/archive/2012/01/06/2315235.html
 * 
 * 下面给出的例子便是电视的开，关和换台。把开，关和换台都当成具体的命令。
 * 
 * Tv是接收者，然后在命令里面调用接受者的具体方法。然后调用者可以是遥控器。
 * 
 * 那么本例中其实就不用有多个receiver，可以有一个具体的实现就可以了，只是不同的命令对应到receiver里面的某一个方法。
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实际执行任务的人
		Receiver ra = new ReceiverA();
		Receiver rb = new ReceiverB();
		
		//命令  在命令类里面依赖执行者
		Command c = new ConcreteCommand(ra);
		
		//调用者  调用者可以传入不同的任务
		Invoker iker = new Invoker(c);
		
		iker.runCommand();
	}

}
