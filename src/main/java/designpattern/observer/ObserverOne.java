package designpattern.observer;

public class ObserverOne implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("ObserverOne is running");
	}

}
