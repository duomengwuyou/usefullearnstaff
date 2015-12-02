package designpattern.prototype;

import java.util.ArrayList;

public class PrototypeClass implements Cloneable{
	
	public String s = "a";
	
	public ArrayList<String> list = new ArrayList<String>();
	
	//�������final���η�  ��ô�ں���Ͳ��������  static���η�������,����static���͵����ڹ���ӵ�еģ����ڸ������������
	//public final ArrayList<String> finalList = new ArrayList<String>();
	public static ArrayList<String> finalList = new ArrayList<String>();
	
	public PrototypeClass clone(){
		try {
			PrototypeClass object = (PrototypeClass)super.clone();
			//listҪ�����
			object.list = (ArrayList<String>)this.list.clone();
			object.finalList = (ArrayList<String>) this.finalList.clone();
			return object;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
