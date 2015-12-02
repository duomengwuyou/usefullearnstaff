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
	 * 归并排序的基本思想就是把应排序好的数组进行合并
	 * 给出数组以及需要归并排序的开始位置和结束位置，然后计算中间位置，然后合并两个数组。重要的是中间有一个临时数组用于存储结果。
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
