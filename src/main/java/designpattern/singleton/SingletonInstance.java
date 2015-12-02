package designpattern.singleton;

public class SingletonInstance {
	
	private SingletonInstance(){}
	
	private static SingletonInstance instance;
	
	private static SingletonInstance getInstance(){
		if(instance == null){
			synchronized(SingletonInstance.class){
				if(instance == null){
					instance = new SingletonInstance();
				}
			}
		}
		return instance;
	}
}
