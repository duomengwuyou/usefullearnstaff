package designpattern.observer;

import java.util.Vector;

/**
 * 被观察者
 *
 */
public class Observable {

	//记录是否有变化
	public boolean change;
	
	//记录所有的观察者
	private Vector os;
	
	//构造函数   初始化观察者列表
	public Observable(){
		this.os = new Vector();
	}
	
	//增加观察者
	public synchronized void addObserver(Observer o){
		if(o == null){
			throw new NullPointerException();
		}else{
			if(!os.contains(o)){
				this.os.add(o);
			}
		}
	}
	
	//删除观察者
	public synchronized void deleteObserver(Observer o){
		this.os.remove(o);
	}
	
	//通知所有观察者进行改变 无参数
	public  void notifyObservers(){
		notifyObservers(null);
	}
	
	//通知所有观察者  有参数
	public  void notifyObservers(Object arg){
		Object[] obs = null;
		
		synchronized(this){
			if(!change){
				return;
			}
			
			obs = this.os.toArray();
			change = false;
				
		}
			
		for(int i = this.os.size()-1; i >= 0; i--){
			((Observer)obs[i]).update(this, arg);
		}

	}
	
}
