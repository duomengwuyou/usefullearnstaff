package sort;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,7,6,4,5,8,3,2,1};
		InsertSort object = new InsertSort();
		object.insertSort(A);
		System.out.println("hello");
	}
	
	/**
	 * 即通过不断的往前面的有序的数组中插入数据。把后面的元素插入到正确的位置。
	 * 外层循环是前面有序数组的最后一个位置；内层循环就是找元素的插入位置。
	 */
	public void insertSort(int[] A){
		int aLength = A.length;
		if(aLength == 0 || aLength == 1){
			return;
		}
		
		for(int i = 1; i < aLength; i++){
			int temp = A[i];
			int j;
			for(j = i-1; j >= 0; j--){
				if(temp < A[j]){
					A[j+1] = A[j];
				}else{
					break;
				}
			}
			A[++j] = temp;
		}
		
	}

}
