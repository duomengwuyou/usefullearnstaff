package sort;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,7,6,4,5,8,3,2,1};
		BubbleSort object = new BubbleSort();
		object.bubbleSort(A);
		System.out.println("hello");
	}
	
	/**
	 * ѡ��������ǲ��ϵĴ�������ѡ��һ�����ֵ������Сֵ��Ȼ���ǰ���Ԫ�ؽ��н���
	 * 
	 */
	public void selectSort(int[] A){
		int aLength = A.length;
		if(aLength == 0 || aLength == 1) return;
		int minPosition;
		int temp;
		for(int i = 0; i < aLength; i++){
			minPosition = i;
			for(int j = i; j < aLength;j++){
				if(A[j] < A[minPosition]){
					minPosition = j;
				}
			}
			
			temp = A[minPosition];
			A[minPosition] = A[i];
			A[i] = temp;
		}
	}

}
