package designpattern.observer;

/**
 * 
 * GoF说道：Observer模式的意图是“定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 * 
 * 观察者模式已经在java里面实现了，可以把观察者模式称为设计模式的皇后
 * 
 * 就是在被观察者中增加观察者，被观察者变化之后就可以通知观察者变化。
 * 
 * http://blog.csdn.net/legendmohenote/article/details/5762350
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable  singer = new Observable();
		//增加裁判
		singer.addObserver(new ObserverOne());
		singer.addObserver(new ObserverTwo());
		
		singer.change = true;
		singer.notifyObservers("");
	}

}
