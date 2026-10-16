public class AP6{
	public static void main(String args[]){
		int[] array={45,12,56,7,3,80};
		int min=array[0];
		for(int num : array){
			if(num<min){
				min=num;
			}
		}
		System.out.println(min);
	}
}