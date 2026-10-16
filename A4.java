public class A4{
	public static void main(String args[]){
		int sum = 0;
		int i = 1;
		while(i<=15){
			System.out.println(i);
			sum+=i;
			i+=2;
		}
		System.out.println("Sum of all odd number:" +sum);
	}
}