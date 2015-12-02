package designpattern.mementor;

/**
 * http://blog.csdn.net/yangyan1990/article/details/5830765
 * http://www.dedecms.com/knowledge/program/jsp-java/2012/0824/13291.html
 * 备忘录模式：是一种行为对象型模式。在不破坏封装性的前提条件下，捕获一个对象的内部状态，并在改对象之外保存该状态。以后就可以将该对象恢复到以前保存的状态。
 * 
 * originator里面持有caretaker   然后mementor里面记状态信息  mementor是originator的内部类
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o = new Originator();
		o.setState("old state");
		o.createMementor();
		o.setState("new state");
		o.roolBack();
		
	}

}
