package cricularlinklist;

import java.util.Scanner;

public class DblyLinkedListMain {

	public static void main(String[] args) {
		DblyLinkList D1 = new DblyLinkList();
		Scanner sc = new Scanner(System.in);
		int choice, data, pos, ele;
		do {
			System.out.print("1. Create List\n");
			System.out.print("2. Add at beginning \n");
			System.out.print("3. Add at end \n");
			System.out.print("4. insert_before_data \n");
			System.out.print("5. Print \n");
			System.out.print("6. Delete by position \n");
			System.out.print("7. Exit ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("create list of :");
				data=sc.nextInt();
				D1.createList(data);
				break;
			case 2:
				System.out.print("Enter data before : ");
				data = sc.nextInt();
				System.out.print("Enter data you want to insert : ");
				ele = sc.nextInt();
				D1.insertBeforeData(data, ele);
	
				break;
			case 3:
				System.out.print(D1.displayAll());
				break;
			case 4:
				System.out.print("Enter pos to delete that data : ");
				pos = sc.nextInt();
				D1.deleteByPosition(pos);
				break;
			case 5:
				break;
			default:
				System.out.print("Invalid choice..\n");
				break;
			}
		} while (true);
	

	}

}
