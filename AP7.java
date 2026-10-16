public class AP7{
	public static void main(String args[]){
		int[] number={12,-5,8,-3,0,-9,15};
		int count=0;
		for(int num : number){
			if(num<0){
				count++;
			}
		}
		System.out.println(count);
	}
}