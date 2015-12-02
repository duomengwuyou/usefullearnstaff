package leetcode151withexplain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ƽ�����кܶ�㣬���ƽ������һ���������ĵ���
 * ����˼·����ͬһ�����ϣ���ô��������������֮���б��һ����ȣ�����Xֵ��ͬ��б��Ϊ����󣩡���ô��ÿһ����Ϊ���㣬�������еĵ㣬��������֮���б�ʣ����������֪��һ�����ϵĵ�����Ƕ��١�����б��������
 * ��������Ե�����������¼ס����xֵ�������ֵ��ͬ�ĵ㡣
 *
 * ʱ�临�Ӷ�O��n^2��
 */
public class MaxPointsonaLine003 {

	  //�ṹ��
	  class Point {
	      int x;
	      int y;
	      Point() { x = 0; y = 0; }
	      Point(int a, int b) { x = a; y = b; }
	  }
	 
	    public int maxPoints(Point[] points) {
	    	//��¼�������  X������ͬ �ص����
            int maxNum = 0;
		    int xequalsMaxNum = 0;
		    int duplicate = 0;
		    
		    //����map���洢ĳб���µĵ�ĸ���
		    Map<Double, Integer> results = new HashMap<Double, Integer>();
		    
		    
		    //����ÿ������
		    for(int i = 0; i < points.length; i++){
		    	
		    	xequalsMaxNum = 0;
		    	duplicate = 0;
		    	results.clear();
		    	//�������е�
		    	for(int j = 0; j < points.length; j++){
		    		
		    		//��������
		    		if(j == i){
		    			duplicate++;
		    			xequalsMaxNum++;
		    			continue;
		    		}
		    		
		    		//�����ظ��� �������continue
		    		if((points[j].y == points[i].y) && (points[j].x == points[i].x)){
		    			duplicate++;
		    			xequalsMaxNum++;
		    			continue;
		    		}
		    		
		    		//����x��ͬ�ĵ㣬��Ϊ�޷�����б�ʣ������ڴ�Ҫ�����¼����X��ͬ�ĵ�
		    		if(points[j].x == points[i].x){
		    			xequalsMaxNum++;
		    		}else{
		    			//����б�ʣ�������ǿ������ת��
		    			double slope = (double)(points[j].y - points[i].y)/(double)(points[j].x - points[i].x);
		    			if(results.get(slope) == null){
		    				results.put(slope, 1);
		    			}else{
		    				int times = results.get(slope);
		    				results.remove(slope);
		    				results.put(slope, times+1);
		    			}
		    			
		    		}
		    		
		    	}
		    	
		    	
		    	//��ȡ���ֵ����ֵ
		    	Collection<Integer> values = results.values();
		    	for(Iterator<Integer> ite = values.iterator();ite.hasNext();){
		    		int currentValue = ite.next();
		    		if(maxNum < currentValue+duplicate){
		    			maxNum =  currentValue+duplicate;
		    		}
		    	}
		    	
		    	//X����ͬҲ����һ��б�ʣ�Ҫ�����Ƚ�
		    	if(maxNum < xequalsMaxNum){
		    		maxNum = xequalsMaxNum;
		    	}
		    	
		    }

			return maxNum;      
	    }

}
