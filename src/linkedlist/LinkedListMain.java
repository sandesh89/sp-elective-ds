package linkedlist;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		CustomList list = new CustomLinkedList();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please provide an URL");
		String url = sc.nextLine();
		
		Page p1 = new Page(url, "Page 1", "header", "footer");
		Page p2 = new Page(url, "Page 2", "header", "footer");
		Page p3 = new Page(url, "Page 4", "header", "footer");
		Page p4 = new Page(url, "Page 4", "header", "footer");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		
		System.out.println("Completed");
		
		
		
		
	}
}
