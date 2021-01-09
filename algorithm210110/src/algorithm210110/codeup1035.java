package algorithm210110;
import java.util.Scanner;

public class codeup1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int a = Integer.parseInt(input,16);
		String b = Integer.toOctalString(a);
		
		System.out.println(b);
	}

}
