package designpattern.composite;

/**
 * 1、组合模式属于结构性模式   主要描述类之间的组合关系
 * 2、java里面的容器类Arraylist就是先了组合接口
 * 3、对象通过实现（继承）统一的接口（抽象类），调用者对单一对象和组合对象的操作具有一致性。
 * 4、文中举例就是对于文件夹和文件的操作就具有统一性，文件就属于单一对象，而文件夹就属于组合对象。
 * 
 * 
 * 组合模式其实就相当于对于某统一的接口，下面有两个实现方式，只是一种的实现方式里面可以包含另外一种实现方式的对象。就好比一个是叶子，一个是非叶子节点，可以包含其他节点。
 * 就是达到了对于集合的操作和对于单个对象的操作达到统一的效果。
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FolderNode folder = new FolderNode("folder1");
		folder.addItem(new FileNode("file1"));
		folder.addItem(new FileNode("file2"));
		
		folder.copy();
	}

}
