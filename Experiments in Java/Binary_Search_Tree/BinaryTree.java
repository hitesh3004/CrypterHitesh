package project1;
import java.util.Scanner;
public class BinaryTree
{
    public static void main(String[] args)
   {            
       Scanner scan = new Scanner(System.in);
       /* Creating object of BTree */
       BTree BTree = new BTree(); 
       /*  Perform tree operations  */
       System.out.println("Binary Tree Test\n");          
       char ch;        
       do    
       {
           System.out.println("\nBinary Tree Operations\n");
           System.out.println("1. insert ");
           System.out.println("2. search");
           System.out.println("3. count nodes");
           System.out.println("4. check empty");

           int choice = scan.nextInt();            
           switch (choice)
           {
           case 1 : 
               System.out.println("Enter integer element to insert");
               BTree.insert( scan.nextInt() );                     
               break;                          
           case 2 : 
               System.out.println("Enter integer element to search");
               System.out.println("Search result : "+ BTree.search( scan.nextInt() ));
               break;                                          
           case 3 : 
               System.out.println("Nodes = "+ BTree.countNodes());
               break;     
           case 4 : 
               System.out.println("Empty status = "+ BTree.isEmpty());
               break;            
           default : 
               System.out.println("Wrong Entry \n ");
               break;   
           }
           /*  Display tree  */ 
           System.out.print("\nPost order : ");
           BTree.postorder();
           System.out.print("\nPre order : ");
           BTree.preorder();
           System.out.print("\nIn order : ");
           BTree.inorder();

           System.out.println("\n\nDo you want to continue (Type y or n) \n");
           ch = scan.next().charAt(0);                        
       } while (ch == 'Y'|| ch == 'y');               
   }
}