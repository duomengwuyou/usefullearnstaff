package sort;

public class BubbleSort {
	public static void main(String[] args){
		int[] A = {9,7,6,4,5,8,3,2,1};
		BubbleSort object = new BubbleSort();
		object.bubbleSort(A);
		System.out.println("hello");
	}
	
	/**
	 * 每次冒泡都获得一个最大值或者最小值，那么下一轮的范围就要缩小一个。所以外城循环代表冒泡多少次，内层循环限定了比较到的范围。
	 * 冒泡排序就是通过不断的交替相邻两个元素的值实现的。
	 */
	public void bubbleSort(int[] A){
		int aLength = A.length;
		if(aLength == 0 || aLength == 1) return;
		int temp = 0;
		for(int i = 0; i < aLength; i++){
			for(int j = 0; j < aLength-1-i;j++){
				if(A[j] > A[j+1]){
					temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
				}
			}
		}
	}
}
