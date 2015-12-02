package sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {8,9,5,4,7,6,2,3,1};
		int[] tempA = new int[9];
		MergeSort object = new MergeSort();
		object.mergeSort(A,tempA,0,8);
		System.out.println("hello");
	}
	
	/**
	 * �鲢����Ļ���˼����ǰ�Ӧ����õ�������кϲ�
	 * ���������Լ���Ҫ�鲢����Ŀ�ʼλ�úͽ���λ�ã�Ȼ������м�λ�ã�Ȼ��ϲ��������顣��Ҫ�����м���һ����ʱ�������ڴ洢�����
	 * 
	 */
	public void mergeSort(int[] A, int[] tempA, int startPosition,int endPosition){
		if(startPosition >= endPosition){
			return;
		}else{
			int middle = (startPosition + endPosition) >> 1;
			mergeSort(A,tempA,startPosition,middle);
			mergeSort(A,tempA,middle+1,endPosition);
			merge(A,tempA,startPosition,middle,endPosition);
		}
	}
	
	public void merge(int[] A, int[] tempA, int startPosition,int middlePosition,int endPosition){
		int count = startPosition;
		int i = startPosition;
		int j = middlePosition+1;
		while(i <= middlePosition && j <= endPosition){
			if(A[i] <= A[j]){
				tempA[count++] = A[i];
				i++;
			}else{
				tempA[count++] = A[j];
				j++;
			}
		}
		
		if(i <= middlePosition){
			for(; i <= middlePosition; i++){
				tempA[count++] = A[i];
			}
		}
		
		if(j <= endPosition){
			for(; j <= endPosition;j++){
				tempA[count++] = A[j];
			}
		}
		
		for(int k = startPosition; k <= endPosition; k++){
			A[k] = tempA[k];
		}
	}

}
