package fiftyQuestionCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithComparator {

	public static void main(String args[]) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Ana", 300));
		list.add(new Student("Bob", 600));
		list.add(new Student("Caleb", 200));
		list.add(new Student("Diana", 240));
		Collections.sort(list, new MarksComp());
		System.out.println("Sorted list entries: ");
		for (Student s : list) {
			System.out.println(s);
		}
	}
}

class MarksComp implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getMarks() < s2.getMarks()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Student {

	private String name;
	private int marks;

	public Student(String n, int m) {
		this.name = n;
		this.marks = m;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setRoll(int Marks, int marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Name: " + this.name + "-- Marks: " + this.marks;
	}
}
