package algorithm200108;
import java.util.*;

public class codeup1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] date = input.split("\\.");
		
		
		int date1 = Integer.parseInt(date[0]);
		int date2 = Integer.parseInt(date[1]);
		int date3 = Integer.parseInt(date[2]);
		
		System.out.printf("%02d-%02d-%04d", date3, date2, date1);
	}

}
