import java.util.concurrent.*;
import java.util.*;

class Employee {
	
	String name;
	Employee(String name) {
		
		this.name = name;
	}
	public String toString() {
	
		return name;
	}
}

class SortedByName implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		
		return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
	}
}

class BlockingQueueDemo {
	
	public static void main(String[] args) {
			
		BlockingQueue bQueue = new PriorityBlockingQueue(3,new SortedByName());
		
		//PriorityQueue bQueue = new PriorityQueue(new SortedByName());

		bQueue.offer(new Employee("Kanha"));
		bQueue.offer(new Employee("Badhe"));
		bQueue.offer(new Employee("Ashish"));
		bQueue.offer(new Employee("Rahul"));

		System.out.println(bQueue);
	}
}
