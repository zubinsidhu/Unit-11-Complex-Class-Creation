import java.util.*;
public class TestingMoreArrayList {

	public static void main(String[] args) {
		ArrayList<Circle> circleList = new ArrayList<>();
		circleList.add(new Circle());
		circleList.add(new Circle(10));
		circleList.add(new Circle(10, "red", true));
		circleList.add(new Circle(1, "blue", false));
		
		System.out.println(circleList);
		System.out.println("The areas of the circles in the list");
		for (Circle e: circleList) {
			System.out.printf("%.2f\n", e.getArea());
		}
		/*
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(0);
		nums.add(0, 4);
		nums.set(3, 2);
		nums.remove(3);
		nums.add(2, 0);	
		System.out.println(nums);
		*/
		/*
		ArrayList<String> syllables = new ArrayList<String>();
		syllables.add("LA");
		syllables.add(0, "DI");
		syllables.set(1, "TU");
		syllables.add("DA");
		syllables.add(2, syllables.get(0));
		syllables.remove(1);
		System.out.println(syllables.toString());
		*/
		/*
		ArrayList<Integer> vals = new ArrayList<Integer>();
		vals.add(vals.size(), vals.size());
		vals.add(vals.size() - 1, vals.size() + 1);
		vals.add(vals.size() - 2, vals.size() + 2);
		System.out.println(vals.toString());
		*/
		/*
		ArrayList<String> words = new ArrayList<String>();
		words.add("mat");
		words.add("new");
		words.add("open");
		words.add("pet");
		int i = 0;
		while (i < words.size())
		{
		words.remove(i);
		i++;
		}
		System.out.println(words.toString());
		*/
		/*
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		arrList.add("D");
		for (int i = 0; i < arrList.size(); i++)
		{
		System.out.print(arrList.remove(i));
		}
		*/
		/*
		ArrayList<Integer> myList = new ArrayList<>();
		int j = 0;

		while (j < myList.size())

		{

		if (myList.get(j) == 0)

		{

		myList.remove(j);

		}

		j++;

		}
		*/
	}
}