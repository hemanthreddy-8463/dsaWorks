package dataStructureDemo;

public class InsertionSortDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {20,35,-15,7,55,1,-22};
		for(int firstUnSortedIndex=1;firstUnSortedIndex<intArray.length;firstUnSortedIndex++) {
			int newElement=intArray[firstUnSortedIndex];
			int i;
			for(i=firstUnSortedIndex;i>0 && intArray[i-1]>newElement;i--){
				intArray[i]=intArray[i-1];
			}
			intArray[i]=newElement;
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}


	}

}
