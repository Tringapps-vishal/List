
//Create simple programs like iterating over array, arraylist, linkedlist, perform simple operations
import java.util.*;

class linkedList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ls = new LinkedList<>();
        while (true) {
            System.out.println("1.Add       2.Delete        3.View       4.Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the item : ");
                    String item = sc.next();
                    ls.addLast(item);
                    System.out.println("ADDED SUCCESSFULLY!!");
                }
                    break;

                case 2: {
                    try {
                        ls.removeLast();
                        System.out.println("DELETED  SUCCESSFULLY!!");
                    } catch (NoSuchElementException e) {
                        System.out.println("list is EMPTY!!");
                    }
                }
                    break;

                case 3: {
                    for (String list : ls)
                        System.out.print(list + "\n");
                }
                    break;

                case 4: {
                    System.exit(0);
                }
                    break;

                default: {
                    System.out.println("Invalid choice");
                }
                    break;
            }
        }
    }
}