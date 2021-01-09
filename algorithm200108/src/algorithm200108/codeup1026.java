package algorithm200108;
import java.util.*;
public class codeup1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] time =input.split("\\:");
		
		int minute = Integer.parseInt(time[1]);
		
		System.out.printf("%d",minute);
	}

}
