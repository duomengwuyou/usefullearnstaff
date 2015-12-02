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
	 * ��ͨ�����ϵ���ǰ�������������в������ݡ��Ѻ����Ԫ�ز��뵽��ȷ��λ�á�
	 * ���ѭ����ǰ��������������һ��λ�ã��ڲ�ѭ��������Ԫ�صĲ���λ�á�
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
