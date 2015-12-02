package designpattern.factory;

public class HumanFactory extends AbstractHumanFactory {
	
	/**
	 * ������ʽ�Ƚ��ر�
	 */
	public Human createHuman(Class<? extends Human> c){	
		Human newh = null;
		try {
			newh = (Human)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newh;
		
	}
}
