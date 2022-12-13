package stack;

import java.util.Scanner;

public class StudentStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack stk = new MyStack();
		
		int option,data;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of student:- ");
		 data =sc.nextInt();
		 
		 do {
			 	System.out.println("1. Add Student Details ");
				System.out.println("2. delete Student Details ");
				System.out.println("3. peek ");
				System.out.println("4. To check stack is full ");
				System.out.println("5. To check stack is empty ");
				System.out.println("6. Display all Student Details ");
				System.out.println("7. exit");
				System.out.print("Enter your option :- ");
				option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter Student rollNo :- ");
				int no = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Student name :- ");
				String name =sc.nextLine();
				
				System.out.println("Enter Student markOfPhysics :- ");
				int markOfPhysics = sc.nextInt();
				
				System.out.println("Enter Student markOfMathematics :- ");
				int markOfMathematics = sc.nextInt();
				
				System.out.println("Enter Student markOfChemistry :- ");
				int markOfChemistry =sc.nextInt();
				
				Student s1 = new Student(no, name, markOfPhysics, markOfMathematics, markOfChemistry);
				stk.push(s1);
				 System.out.println("Student details added :-");
				 System.out.println("--------------------------");
				break;
			}
			case 2 : {
				System.out.println("Details deleted "+stk.pop());
				System.out.println("----------------------------");
				break;
			}
			case 3:{
				System.out.println("Peek Student "+stk.peek());
				System.out.println("----------------------------");
				break;
			}
			case 4: {
				System.out.println("is stack full :- "+stk.isFull());
				System.out.println("----------------------------");;
				break;
			}
			case 5:{
				System.out.println("is stack empty :- "+stk.isEmpty());
				System.out.println("----------------------------");
				break;
			}
			case 6:{
				System.out.println("All Student :- "+stk.tostring());
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
				break;
			}
			 
			 
		 }while(true);
	}

}
