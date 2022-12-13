package stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		
		int choice, data, val;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array length :- ");
		 data =sc.nextInt();
		st = new Stack(data);
		do {
		System.out.println("1. Add element ");
		System.out.println("2. delete element ");
		System.out.println("3. peek ");
		System.out.println("4. To check stack is full ");
		System.out.println("5. To check stack is empty ");
		System.out.println("6. Display all element ");
		System.out.println("7. exit");
		System.out.print("Enter your option :- ");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.print("Enter data to push :- ");
			val = sc.nextInt();
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
			System.out.println("The peek number : "+st.peek());
			System.out.println("----------------------------");
			break;
		}
		case 4: {
			System.out.println("Is stack full :- "+st.isFull());
			System.out.println("----------------------------");
			break;
		}
		case 5 :{
			System.out.println("Is stack empty :- "+st.isEmpty());
			System.out.println("----------------------------");
			break;
		}
		case 6 :{
			System.out.println("All array element are "+st.tostring());
			System.out.println("----------------------------");
			break;
		}
		case 7 : {
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
