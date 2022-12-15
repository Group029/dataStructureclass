package linklist.circularlink;

import java.util.Scanner;

public class CircularListMain {

	public static void main(String[] args) {
		int val, choice;
		CircularLinkList cl = new CircularLinkList();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" 1.Insert element at first \n 2. Insert element last \n 3. Display all \n 4. Insert by postion \n 5. delete First \n 6.delete Last \n 7. delete by data \n 8.Exit");
			System.out.println("Enter Option :- ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter value :- ");
				val = sc.nextInt();
				cl.insertFirst(val);
				break;
			}
			case 2 :{
				System.out.print("Enter value :- ");
				val = sc.nextInt();
				cl.insertLast(val);
				break;
			}
			case 3:{
				System.out.println("Array values are "+cl.dispalyAll());
				break;
			}
			case 4 :{
				System.out.println(" Enter value :- ");
				val = sc.nextInt();
				System.out.println(" Enter Position :- ");
				int pos = sc.nextInt();
				cl.insertByPosition(val, pos);
				break;
			}
			case 5:{
				System.out.println("deleted element :- "+cl.deleteFirst());
				break;
			}
			case 6:{
				System.out.println("deleted element :- "+cl.deleteLast());
				break;
			}
			case 7:{
				System.out.println("Enter value :- ");
				val = sc.nextInt();
				System.out.println("value is delated :- "+cl.deleteByData(val));
				break;
			}
			case 8 :{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid option");
				break;
			}
			
		}while(true);
	}
}
