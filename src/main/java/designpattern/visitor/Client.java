package designpattern.visitor;

/**
 * http://www.cnblogs.com/java-my-life/archive/2012/06/14/2545381.html
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure os = new ObjectStructure();
		os.add(new NodeA());
		os.add(new NodeB());
		
		os.action(new VisitorA());
		os.action(new VisitorB());
	}

}
