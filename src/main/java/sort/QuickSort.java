package sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,6,3,9,4};
		QuickSort object = new QuickSort();
		object.selfQuickSort(A, 0, 4);
		System.out.println("12");
	}
	
	
	/**
	 * ���������������������ȷ����һ��λ�ã�Ȼ����ַ�ȥʵ�־Ϳ����ˡ�
	 * 
	 * �鲢����������ҵ��м�λ�ã�Ȼ��ݹ����ʹ���������Ȼ��ݹ����ʹ����������Ȼ����merge����
	 * 
	 * �������������ҵ�ת�����ĵ㣬Ȼ�����ε��ÿ����������ߺ��ұߡ�
	 * 
	 */
	public void quickSort(int[] A,int startPosition,int endPosition){
		if(startPosition >= endPosition){
			return;
		}
		int partitionPosition = partition(A,startPosition,endPosition);
		quickSort(A,startPosition,partitionPosition-1);
		quickSort(A,partitionPosition+1,endPosition);
	}
	
	/*
	 * ������С�ڻ�ֵ��һ��ѡ��������Ԫ�أ��������������������ߣ���������˽�����iλ�ú�endPositionλ���������ݡ�
	 */
	public int partition(int[] A, int startPosition, int endPosition){
		int compareInt = A[endPosition];
		int i = startPosition - 1, j;
	    for(j = startPosition; j < endPosition; j++)
	    {
	        if(A[j] >= compareInt)
	        {
	            i++;
	            swap(A,i,j);
	        }
	    }
	    swap(A,i+1,endPosition);
	    return i + 1;
		
	}
	
	public void swap(int[] A, int leftPosition, int rightPosition){
		int temp = A[leftPosition];
		A[leftPosition] = A[rightPosition];
		A[rightPosition] = temp;
	}
	
	//self try
	public void selfQuickSort(int[] A,int startPosition,int endPosition){
		if(startPosition >= endPosition){
			return;
		}
		
		int partitionPosition = selfPartition(A,startPosition,endPosition);
		selfQuickSort(A,startPosition,partitionPosition-1);
		selfQuickSort(A,partitionPosition+1,endPosition);
		
	}
	
	public int selfPartition(int[] A,int leftPosition,int rightPosition){
		int i = leftPosition-1;
		for(int k = leftPosition; k < rightPosition; k++){
			if(A[k] <= A[rightPosition]){
				i++;
				swap(A,k,i);
			}
		}
		swap(A,rightPosition,i+1);
		return i+1;
	}

}
