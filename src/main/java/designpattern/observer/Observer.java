package designpattern.observer;

/**
 * 观察者接口  用于更新操作
 *
 */
public interface Observer {
	
	public void update(Observable o, Object arg);
}
