public class AP5{
	public static void main(String args[]){
		int[] numbers={12,65,30,88,90,42};
		int count=0;
		for(int num : numbers){
			if(num>50){
				count++;
				System.out.println(num);
			}
		}
	}
}