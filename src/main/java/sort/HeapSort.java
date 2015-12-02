package sort;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,6,5,3,2,7,8,1,9};
		HeapSort object = new HeapSort();
		object.heapSort(A);
		System.out.println("hello");
	}

	/**
	 * 堆排序。首先明确堆的标示是通过数组。然后先构建最大堆或者最小堆。数组的中间元素位置开始调整堆。然后获取堆排序的时候就是不断的从堆的顶端拿走元素放到最后面，然后从头部调整堆结构。
	 * 注意调整堆的函数参数：调整位置，以及调整的范围。
	 * 
	 * 首先明确堆排序是通过数组来模拟完全二叉树来实现的。而且在排序的时候从中间位置开始（因为中间位置之后的数据都是叶子节点），这时候开始下标往往是A。length/2 -1.然后采用自顶向下的方式进行调整
	 * 构建完成之后，便可以得到一棵最大堆或者最小堆，然后依次取出对顶端元素，将堆顶元素与最后一个元素交换，然后再与最后可交换的元素进行交换
	 * 
	 * 
	 */
	public void heapSort(int[] A){
		for(int i = A.length/2 - 1; i >= 0; i--){
			adjustUpDown(A,i,A.length);
		}
		
		for(int i = 0; i < A.length; i++){
			System.out.println(A[0]);
			swap(A,0,A.length-1-i);
			adjustUpDown(A,0,A.length-1-i);
		}
	}
	
	
	public void swap(int[] A, int i,int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	
	/**
	 * 从上往下开始调整
	 * @param A  数组
	 * @param i  指定位置
	 * @param n  数组范围
	 */
	public void adjustUpDown(int[] A, int i, int n){
		int temp = A[i];
		int j = 2*i + 1;
		while(j < n){
			if(j+1 < n && A[j+1] < A[j]){
				j++;
			}
			
			if(A[j] > temp){
				break;
			}
			
			A[i] = A[j];
			i = j;
			j = 2*i+1;
		}
		A[i] = temp;
	}
	
}
