
public class First {
	public static void main(String[] args) {
		System.out.println("For Loop");
		for(int i=1; i<=10; i++) {
			
			if(i == 8) {
				break;
			}
			System.out.println(i);
			}
		
		System.out.println("While Loop");
		int j = 1;
		while(j<=10) {
			
			if(j==8) {
				j++;
				continue;
			}
			System.out.println(j);
			j++;
			
		}
		
		System.out.println("do..while loop");
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}while(k <= 10);
	}

}
