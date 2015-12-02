package sort;

public class BubbleSort {
	public static void main(String[] args){
		int[] A = {9,7,6,4,5,8,3,2,1};
		BubbleSort object = new BubbleSort();
		object.bubbleSort(A);
		System.out.println("hello");
	}
	
	/**
	 * ÿ��ð�ݶ����һ�����ֵ������Сֵ����ô��һ�ֵķ�Χ��Ҫ��Сһ�����������ѭ������ð�ݶ��ٴΣ��ڲ�ѭ���޶��˱Ƚϵ��ķ�Χ��
	 * ð���������ͨ�����ϵĽ�����������Ԫ�ص�ֵʵ�ֵġ�
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
