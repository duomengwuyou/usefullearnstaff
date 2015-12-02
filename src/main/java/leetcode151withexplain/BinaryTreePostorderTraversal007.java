package leetcode151withexplain;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * �������ĺ������������ӣ��Һ��ӣ����ڵ�
 * 
 * ���õݹ��˼�룬�ݹ��в��õ�˼·���Ǽ�����ú������ǳɹ��ģ���ô�Ѹ���������֮��Ȼ���ٴ������ݾ��У����ÿ��ǵ�̫ϸ�ڡ�
 *
 *http://www.cnblogs.com/dolphin0520/archive/2011/08/25/2153720.html
 */
public class BinaryTreePostorderTraversal007 {
	
	//���Ľڵ����ݽṹ
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	
	//���õݹ���õķ�ʽ  
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> results =  new ArrayList<Integer>();
		
		if(root == null){
			return results;
		}
		
		//��ȡ���������������ı������  ���뵽��һ�ֵĽ����
		ArrayList<Integer> leftSonArray = postorderTraversal(root.left);
		ArrayList<Integer> rightSonArray = postorderTraversal(root.right);
		if(leftSonArray != null){
		    results.addAll(leftSonArray);
		}
		if(rightSonArray != null){
		    results.addAll(rightSonArray);
		}
		
		results.add(root.val);
		
	    
	    return results;
    }
	
	
	/**
	 * �����Ƿǵݹ�ķ�ʽ���к���������
	 * 
	 * ͨ��һ��ջ�����ƽڵ�Ĵ�ӡ˳��
	 * 
	 * ��ӡһ���ڵ�������ǣ��ڵ�����Һ��Ӷ��ǿյģ���ʱ����Ҷ�ӽڵ㣬��ӡ��������������Լ����ӽڵ����б����ʵģ�Ҳ����pre�����Լ���һ�����ӽڵ㡣pre������¼ǰһ�������Ľڵ���ʲô��
	 * 
	 * ѹ��ջ��˳�������ѹ���Լ����Һ��ӣ�Ȼ�����Լ�������
	 * 
	 */
	public List<Integer> postorderTraversal2(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        TreeNode cur = null;
        stack.push(root);
        while(!stack.isEmpty()){
            cur = stack.peek();
            if((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right))){
                result.add(cur.val);
                stack.pop();
                pre = cur;
                continue;
            }
            
            if(cur.right != null){
                stack.push(cur.right);
            }
            
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
        
        return result;
    }
}
