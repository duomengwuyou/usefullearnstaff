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
	 * ������������ȷ�ѵı�ʾ��ͨ�����顣Ȼ���ȹ������ѻ�����С�ѡ�������м�Ԫ��λ�ÿ�ʼ�����ѡ�Ȼ���ȡ�������ʱ����ǲ��ϵĴӶѵĶ�������Ԫ�طŵ�����棬Ȼ���ͷ�������ѽṹ��
	 * ע������ѵĺ�������������λ�ã��Լ������ķ�Χ��
	 * 
	 * ������ȷ��������ͨ��������ģ����ȫ��������ʵ�ֵġ������������ʱ����м�λ�ÿ�ʼ����Ϊ�м�λ��֮������ݶ���Ҷ�ӽڵ㣩����ʱ��ʼ�±�������A��length/2 -1.Ȼ������Զ����µķ�ʽ���е���
	 * �������֮�󣬱���Եõ�һ�����ѻ�����С�ѣ�Ȼ������ȡ���Զ���Ԫ�أ����Ѷ�Ԫ�������һ��Ԫ�ؽ�����Ȼ���������ɽ�����Ԫ�ؽ��н���
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
	 * �������¿�ʼ����
	 * @param A  ����
	 * @param i  ָ��λ��
	 * @param n  ���鷶Χ
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
