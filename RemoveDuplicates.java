import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		//getDistinct2
		/*
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(4);
		list1.add(4);
		list1.add(1);
		list1.add(1);
		
		list2.add(1);
		list2.add(7);
		list2.add(2);
		list2.add(2);
		list2.add(9);
		list2.add(8);
		list2.add(1);
		*/
		
		//Filter
		list1.add(6);
		list1.add(6);
		list1.add(7);
		list1.add(7);
		list1.add(1);
		list1.add(7);
		list1.add(9);
		list1.add(6);
		list1.add(2);
		list1.add(7);

		list2.add(6);
		list2.add(3);
		list2.add(2);
		list2.add(2);
		list2.add(9);
		list2.add(5);
		list2.add(5);
		
		/*
		//In Both
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(7);
		list1.add(2);
		list1.add(2);
		list1.add(6);
		list1.add(7);
		list1.add(0);
		list1.add(0);
		
		list2.add(1);
		list2.add(7);
		list2.add(2);
		list2.add(2);
		list2.add(7);
		list2.add(6);
		list2.add(1);
		*/
		getDistinct2(list1);
		//filter(list1, list2);
		System.out.println(list1);
		//System.out.println(inBoth(list1, list2));
	}
	
	public static void getDistinct2(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int j = i + 1;
			while (j < list.size()) {
				if (list.get(i) == list.get(j)) list.remove(j);
				else j++;
			}
		}
	}
	
	public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (Integer e: list2) {
			for (int i = list1.size() - 1; i >= 0; i--) {
				if (list1.get(i) == e) list1.remove(i);
			}
		}
	}
	
	public static ArrayList<Integer> inBoth(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> result = new ArrayList<>();
		for (Integer e: list2) {
			if (list2.contains(e) && !result.contains(e)) {
				result.add(e);
			}
		}
		return result;
	}
}
