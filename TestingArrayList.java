import java.util.*;
public class TestingArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("Pheonix");
		cityList.add("Scottsdale");
		cityList.add("Tempe");
		cityList.add("Chandler");
		cityList.add("Los Angeles");
		cityList.add("Las Vegas");
		
		System.out.println(cityList);
		System.out.println("List size: " + cityList.size());
		System.out.println("Is Miami in the list: " + cityList.contains("Miami"));
		System.out.println("Location of Scottsdale: " + cityList.indexOf("Scottsdale"));
		System.out.println("Location of Denver: " + cityList.indexOf("Denver"));
		System.out.println("Is list empty?: " + cityList.isEmpty());
		
		//This remove method removes value at index given rather than value given
		cityList.remove(cityList.size() - 1);
		System.out.println(cityList);
		for (int i = cityList.size() - 1; i >= 0; i--) {
			System.out.print(cityList.get(i) + " ");
		}	
	}
}