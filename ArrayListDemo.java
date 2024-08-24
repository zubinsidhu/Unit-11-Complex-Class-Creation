import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers. Input ends with 0: ");
		ArrayList<Integer> demoList = new ArrayList<>();
		int n;
		do {
			n = input.nextInt();
			if (!demoList.contains(n) && n != 0) demoList.add(n);
		}while (n != 0);
		input.close();
		System.out.println(demoList);
	}

}
