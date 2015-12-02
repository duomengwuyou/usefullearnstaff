package designpattern.composite;

/**
 * 1�����ģʽ���ڽṹ��ģʽ   ��Ҫ������֮�����Ϲ�ϵ
 * 2��java�����������Arraylist����������Ͻӿ�
 * 3������ͨ��ʵ�֣��̳У�ͳһ�Ľӿڣ������ࣩ�������߶Ե�һ�������϶���Ĳ�������һ���ԡ�
 * 4�����о������Ƕ����ļ��к��ļ��Ĳ����;���ͳһ�ԣ��ļ������ڵ�һ���󣬶��ļ��о�������϶���
 * 
 * 
 * ���ģʽ��ʵ���൱�ڶ���ĳͳһ�Ľӿڣ�����������ʵ�ַ�ʽ��ֻ��һ�ֵ�ʵ�ַ�ʽ������԰�������һ��ʵ�ַ�ʽ�Ķ��󡣾ͺñ�һ����Ҷ�ӣ�һ���Ƿ�Ҷ�ӽڵ㣬���԰��������ڵ㡣
 * ���Ǵﵽ�˶��ڼ��ϵĲ����Ͷ��ڵ�������Ĳ����ﵽͳһ��Ч����
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
