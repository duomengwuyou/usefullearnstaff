package designpattern.observer;

import java.util.Vector;

/**
 * ���۲���
 *
 */
public class Observable {

	//��¼�Ƿ��б仯
	public boolean change;
	
	//��¼���еĹ۲���
	private Vector os;
	
	//���캯��   ��ʼ���۲����б�
	public Observable(){
		this.os = new Vector();
	}
	
	//���ӹ۲���
	public synchronized void addObserver(Observer o){
		if(o == null){
			throw new NullPointerException();
		}else{
			if(!os.contains(o)){
				this.os.add(o);
			}
		}
	}
	
	//ɾ���۲���
	public synchronized void deleteObserver(Observer o){
		this.os.remove(o);
	}
	
	//֪ͨ���й۲��߽��иı� �޲���
	public  void notifyObservers(){
		notifyObservers(null);
	}
	
	//֪ͨ���й۲���  �в���
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
