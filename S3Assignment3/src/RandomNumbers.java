import java.util.Scanner;
public class RandomNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, res, i;
		Scanner sc = new Scanner(System.in);		
		System.out.println("The lower range is 0");		
		System.out.println("Enter the higher range: ");		
		num1 = sc.nextInt();		
		RandClass rn = new RandClass();		
		System.out.println("Random Numbers between 0 and " + num1 + " are: ");		
		for (i=0; i<num1; i++){			
		res = rn.randInt(num1);			
		System.out.println(res);
	}
	}
}