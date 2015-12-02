package designpattern.mementor;

public class Originator {
	
	private String state;
	
	private Caretaker ct = new Caretaker();
	
	public Originator(){
	}
	
	public void createMementor(){
		ct.setM(new MementorImp(this.state));
	}
	
	public void setState(String s){
		this.state = s;
		System.out.println("the state is " + state);
	}
	
	public void roolBack(){
		MementorImp memento = (MementorImp) ct.getM();
		state = memento.getSaveState();
		System.out.println("the state is " + state);
	}
	
	
	//�ڲ���������Ե����������˽�з�����˽�б���
	protected class MementorImp implements Mementor{
		private String saveState;
		
		public MementorImp(String ss){
			this.saveState = ss;
		}

		public String getSaveState() {
			return saveState;
		}

		public void setSaveState(String saveState) {
			this.saveState = saveState;
		}
	
	}
}
