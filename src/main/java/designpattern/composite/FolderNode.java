package designpattern.composite;

import java.util.ArrayList;

public class FolderNode implements Node {
	
	private String folderName;
	
	private ArrayList nodeList = new ArrayList();
	
	public FolderNode(String fName){
		this.folderName = fName;
	}
	

	public void addItem(Node n){
		this.nodeList.add(n);
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println(this.folderName+" Folder is copy");
		for(int i = 0; i < nodeList.size(); i++){
			Node n = (Node) this.nodeList.get(i);
			n.copy();
		}
	}

}
