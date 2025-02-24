package dataStructureDemo;
//time complexcity-O(n*2)
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {20,35,-15,7,55,1,-22};
		
		for(int lastUnSortedIndex=intArray.length-1;lastUnSortedIndex>0;lastUnSortedIndex--) {
			int largest=0;
			for(int i=1;i<=lastUnSortedIndex;i++) {
				if(intArray[largest]<intArray[i]) {
					largest=i;
				}
			}
			swap(intArray,largest,lastUnSortedIndex);
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}

	}
	public static void swap(int[] array,int i,int j) {
		if(i==j) {
			return;
		}
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}

}
