public class AEven1{
	public static void main(String args[]){
		int[] arr={87,68,94,100,36};
		int odd=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2=0){
				odd++;
			}
			System.out.println(odd);
		}

	}
}