package linklistwithqueue;

import java.util.Scanner;

public class LinkList {
	
	public static void main(String []args) {
	int choice;
	char val;
	Scanner sc = new Scanner(System.in);
	LinkListWithQueue st = new LinkListWithQueue();
	do {
	System.out.println(" 1. Add element \n 2. delete element \n 3. Show top element \n 4. show all \n 5.Exit ");
	System.out.print("Enter your option :- ");
	choice = sc.nextInt();
	switch (choice) {
	case 1: {
		System.out.print("Enter data to push :- ");
		val = sc.next().charAt(0);
		st.enqueue(val);
		System.out.println("----------------------------");
		break;
	}
	case 2: {
		System.out.println("deleted element : "+st.dequeue());
		System.out.println("----------------------------");
		break;
	}
	case 3: {
		System.out.println("The peek charter : "+st.p());
		System.out.println("----------------------------");
		break;
	}
	case 4: {
		System.out.println("Is stack full :- "+st.displayAllChar());
		System.out.println("----------------------------");
		break;
	}
	case 5 : {
		System.exit(0);
		break;
	}
	default:
		System.out.println("Invalid options");
		System.out.println("----------------------------");
	}
	}while(true);
}
}
