package leetcode151withexplain;

import java.util.HashMap;

/**
 * �����������
 * ����һ����δ��������飬Ȼ������������������ֳ����Ƕȶ��١�
 * Given [100, 4, 200, 1, 3, 2],
   The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4. 
 *
 * ����Ҫ��ĸ��Ӷ���O��n����ͨ��һ��map����¼�����Ƿ��Ѿ��������������ÿһ���������󲻶�++�������Ƿ���map�У�Ȼ���������--�������Ƿ���map�С�
 */
public class LongestConsecutiveSequence023 {

	public int longestConsecutive(int[] num) {
        int numLength = num.length;
        //ͨ��map����־�����Ƿ񱻷��ʹ�
        HashMap<Integer,Integer> values = new HashMap<Integer, Integer>();
        for(int i = 0; i < numLength; i++){
            values.put(num[i],1);
        }
        
        //result��¼���  tempLength��¼��ʱ���
        int result = 0;
        int tempLength = 1;
        for(int j = 0; j < numLength; j++){
            tempLength = 1;
            //��ʼ�������ұߵ�����  �����δ���ʣ���ô���Ƴ�������ݣ���Ŀ����++
            int tempNum1 = num[j]+1;
            while(values.containsKey(tempNum1)){
                values.remove(tempNum1);
                tempLength++;
                tempNum1++;
            }
            
            //��ʼ��������ߵ�����
            int tempNum2 = num[j]-1;
            while(values.containsKey(tempNum2)){
                values.remove(tempNum2);
                tempLength++;
                tempNum2--;
            }
            
            //����ʱ����滻���
            if(result < tempLength){
                result = tempLength;
            }
            
        }
        
        return result;
    }
}
