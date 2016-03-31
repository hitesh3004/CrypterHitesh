package project1;

import java.io.*;
public class LinkedList {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/* Creating object of LList */
		LList LL=new LList();
		/* Perform Linked List operations */
		System.out.println("Linked List");
		char ch;
		do{
			System.out.println("Linked List Operation");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Get Size");
			System.out.println("4. Check Empty");
			
			int choice =Integer.parseInt(br.readLine());
			switch(choice){
			case 1:
				System.out.println("Enter integer element to insert");
				LL.insert(Integer.parseInt(br.readLine()));
				break;
			case 2:
				System.out.println("Enter integer element to seach");
				System.out.println("Search Result: "+LL.search(Integer.parseInt(br.readLine())));
				break;
			case 3:
				System.out.println("Nodes= "+LL.size());
				break;
			case 4:
				System.out.println("Empty status = "+LL.isEmpty());
				break;
			default:
				System.out.println("Wrong Entry");
				break;
			}
			/* Display Linked List */
			System.out.print("Printed LinkedList ");
			LL.traverse();
			System.out.println("\n \n Do you want to continue(Type y or n)");
			ch=br.readLine().charAt(0);
		}while(ch=='Y'||ch=='y');
	}
}
