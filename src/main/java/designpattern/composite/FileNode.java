package designpattern.composite;

public class FileNode implements Node {

	private String fileName;
	
	public FileNode(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println(this.fileName+"文件拷贝成功！");
	}

}
