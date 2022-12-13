package Queue;

import java.util.Scanner;

public class MyQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		MyQueue queue = new MyQueue();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Queue :- ");
		int size = sc.nextInt();
		queue = new MyQueue(size);
		
		do {
			System.out.println(" 1. Add element :- \n 2. delete element \n 3. peek first \n 4. Show all \n 5. exit");
			System.out.print("Enter your Option :-");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter element to add :- ");
				int val = sc.nextInt();
				queue.insert(val);
				System.out.println(" Value Inserted ");
				break;
			}
			case 2:{
				System.out.println("Delete element is "+queue.delete());
				break;
			}
			case 3:{
				System.out.println("Front element of Queue :- "+queue.peek());
				break;
			}
			case 4:{
				System.out.println("All element of array :- "+queue.tostring());
				break;
			}
			case 5:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invail choice ..");
			}
			
		}while(true);
	}
}
