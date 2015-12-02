package leetcode151withexplain;


/**
 * �������⣺����Nqueenes�Ľ������
 * 
  * �����������е���Ŀ  ��ʵҲ����������е�·��  ֻ�Ƿǵݹ�ķ�ʽʵ�ֵ�
 * 
 * ����˼·��˼·����ͨ��һ�������¼סÿһ��queenӦ�÷ŵ���λ�ã�Ȼ�󲻶ϵ�ѭ����֪��û�е�ǰ���Է��õĻʺ�t < 0��.
 *
 */
public class NQueensII102 {
	

	public int[] position;
    public int totalNQueens(int n) {
        int sum = 0;
        if(n == 0) return sum;
       
        position = new int[n+1];
        
        position[1] = 0;
        int t = 1;
        while(t > 0){
        	//ͨ��t�����Ƶ�ǰ�Ƿ��õ��Ǹ�����
            position[t] += 1;
            //���ϵ����°ڷţ�֪���ҵ����ʵ�λ��
            while(position[t] <= n && !place(t,n)){
                position[t]++;
            }
            
            //������ȷ����֮���ж������Ƿ���õ����һ�����ӣ�������ǣ���ô�ͷ���һ����
            //����ҵ���λ�������һ��λ��   ��ô��Ҫ�жϵ�ǰ�Ļʺ��Ƿ������һ���ʺ�
            if(position[t] <= n){
                if(t == n){
                    sum++;
                //����� ��ô������һ���ʺ�
                }else{
                    position[++t] = 0;
                }
            //Ҳ���Ǳ����Ҳ����ʵ���λ��  ��ô���˵���һ���ʺ�
            }else{
                t--;
            }
            
        }
        
        return sum;    
    }
    
    public boolean place(int ith,int n){
        for(int i = 1; i < ith; i++){
            if(position[ith] == position[i] || Math.abs(position[ith] - position[i]) == Math.abs(ith - i)){
                return false;
            }
        }
        return true;
    }
}
