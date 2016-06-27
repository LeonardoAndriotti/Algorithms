package br.com.library.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(9);

		Collections.sort(list, new MyComparator());
		System.out.println(list);
		new ComparatorInJavaTwo().orderedNumber(list);

	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer a0, Integer a1) {
		return (a0 < a1 ? -1 : (a0 == a1 ? 0 : 1));
	}

}

class ComparatorInJavaTwo {
	public void orderedNumber(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer a1, Integer a2) {
				return (a1 > a2) ? -1 : (a1 == a2) ? 0 : 1;
			}
		});
		System.out.println("lista B" + list);
	}
}
