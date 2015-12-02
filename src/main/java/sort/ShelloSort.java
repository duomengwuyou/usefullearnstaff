package sort;

public class ShelloSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {25,19,6,58,34,10,7,98,160,0};
		shellSort3(a);
	}
	
	public static void Display(int[] a){
		int aLength = a.length;
		for(int i = 0; i < aLength; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void shellSort2(int[] a){
		int aLength = a.length;
		int d = aLength/2;
		while(d >= 1){
			
			for(int i = d; i < aLength; i++){
				int temp = a[i];
				int j = i - d;
				while(j >= 0 && a[j] > temp){
					a[j+d] = a[j];
					j = j - d;
				}
				a[j+d] = temp;
			}
			
			Display(a);
			d = d/2;
		}

	}
	
	
	public static void shellSort3(int[] A){
		int aLength = A.length;
		int d = aLength/2;
		while(d >= 1){
			
			for(int i = d; i < aLength; i++){
				int temp = A[i];
				int j = i - d;
				while(j >= 0 && A[j] > temp){
					A[j+d] = A[j];
					j = j - d;
				}
				A[j+d] = temp;
			}
			d = d/2;
		}
		Display(A);
	}
	
	
	
	//希尔排序属于插入排序的一种  希尔排序复杂度 nlog(n)
	public static void shellSort(int[] a){
		int aLength = a.length;		
		int d = aLength/2;   //设置希尔排序的增量
        int i ;
        int j;
        int temp;
        while(d>=1)
        {
        	  //不断的缩小d的范围，下面的循环其实就是通过d把原来的数组编程了很多数组，然后就行插入排序
              for(i=d;i<aLength;i++)
              {
                   temp=a[i];
                   j=i-d;
                   //明确判断条件  后面的用前面的替换  所以是 a[j+d] = a[j]
                   while(j>=0 && a[j]>temp)
                   {
                            a[j+d]=a[j];
                            j=j-d;
                   }
                   a[j+d] = temp;
              }
              Display(a);
              d= d/2;    //缩小增量
        }
	}

}
