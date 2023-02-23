import java.util.*;

class arraylist {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        while (true) {
            System.out.println("1.Add       2.Remove        3.View      4.Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            if (ch == 4) {
                System.out.println("Exited!!");
                System.exit(0);
            }
            switch (ch) {
                case 1: {
                    System.out.print("Enter the element:");
                    String element = sc.next();
                    al.add(element);
                    System.out.println("Element added successfully.");
                }
                    break;
                case 2: {
                    System.out.print("Enter the element:");
                    String element = sc.next();
                    if (al.contains(element)) {
                        al.remove(element);
                        System.out.println("Element Deleted successfully.");
                    } else {
                        System.out.println("Element not found.");
                    }
                }
                    break;
                case 3: {
                    System.out.println(al);
                }
                    break;
                default: {
                    System.out.println("Enter the valid choice!!.");
                }
                    break;
            }
        }
    }
}