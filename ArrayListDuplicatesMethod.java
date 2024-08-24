import java.util.*;
public class ArrayListDuplicatesMethod {

	public static void main(String[] args) {
		ArrayList<Integer> demoList = new ArrayList<>();
		demoList.add(1);
		demoList.add(2);
		demoList.add(3);
		demoList.add(2);
		demoList.add(1);
		demoList.add(6);
		demoList.add(5);
		demoList.add(7);
		demoList.add(1);
		demoList.add(1);
		demoList.add(6);
		demoList.add(8);
		demoList.add(3);
		demoList.add(9);
		demoList.add(4);
		demoList.add(4);
		System.out.println(demoList);
		//System.out.println(removeDuplicates(demoList));
		System.out.println(removeEvens(demoList));
		System.out.println(secondRemoveEvens(demoList));
		System.out.println(thirdRemoveEvens(demoList));
	}
	/*
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a){
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			if (!result.contains(a.get(i))) result.add(a.get(i));
		}
		return result;
	}
	*/
	public static ArrayList<Integer> removeEvens(ArrayList<Integer> a){
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 0) {
				a.remove(i);
				i--;
			}
		}
		return a;
	}
	
	public static ArrayList<Integer> secondRemoveEvens(ArrayList<Integer> a){
		for (int i = a.size() - 1; i > 0; i--) {
			if (a.get(i) % 2 == 0) {
				a.remove(i);
				i++;
			}
		}
		return a;
	}

	public static ArrayList<Integer> thirdRemoveEvens(ArrayList<Integer> a){
		int i = 0;
		while (i < a.size()) {
			if (a.get(i) % 2 == 0) {
				a.remove(i);
			}
			else
				i++;
		}
		return a;
	}
}
