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
	 * 快速排序就是先在数组中确定好一个位置，然后二分法去实现就可以了。
	 * 
	 * 归并排序的是先找到中间位置，然后递归调用使得左边有序，然后递归调用使得右面有序；然后在merge操作
	 * 
	 * 快速排序，首先找到转换处的点，然后依次调用快速排序的左边和右边。
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
	 * 把所有小于基值（一般选择最后面的元素）的数都交换到数组的左边，后面别忘了交换了i位置和endPosition位置上面数据。
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
