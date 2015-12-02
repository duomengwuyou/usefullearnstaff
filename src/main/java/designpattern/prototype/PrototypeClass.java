package designpattern.prototype;

import java.util.ArrayList;

public class PrototypeClass implements Cloneable{
	
	public String s = "a";
	
	public ArrayList<String> list = new ArrayList<String>();
	
	//如果加上final修饰符  那么在后面就不能深拷贝了  static修饰符还可以,但是static类型的属于公共拥有的，属于各个类所共享的
	//public final ArrayList<String> finalList = new ArrayList<String>();
	public static ArrayList<String> finalList = new ArrayList<String>();
	
	public PrototypeClass clone(){
		try {
			PrototypeClass object = (PrototypeClass)super.clone();
			//list要做深拷贝
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
