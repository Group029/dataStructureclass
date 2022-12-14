package stackusinglinklist;

import java.util.Scanner;

;

public class StackWithLinkListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithLinkList st = new StackWithLinkList();
		
		int choice;
		char val;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println(" 1. Add element \n 2. delete element \n 3. Show top element \n 4. show all \n 5.Exit ");
		System.out.print("Enter your option :- ");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.print("Enter data to push :- ");
			val = sc.next().charAt(0);
			st.push(val);
			System.out.println("----------------------------");
			break;
		}
		case 2: {
			System.out.println("deleted element : "+st.pop());
			System.out.println("----------------------------");
			break;
		}
		case 3: {
			System.out.println("The peek charter : "+st.peek());
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
