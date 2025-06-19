package learnInit;

import java.util.HashMap;
import java.util.Scanner;

public class trying3java {
   
public class SimpleHashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- HashMap Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter key (String): ");
                    String key = sc.nextLine();
                    System.out.print("Enter value (Integer): ");
                    int value = sc.nextInt();
                    map.put(key, value);
                    System.out.println("Inserted.");
                    break;

                case 2:
                    System.out.print("Enter key to search: ");
                    key = sc.nextLine();
                    if (map.containsKey(key))
                        System.out.println("Value: " + map.get(key));
                    else
                        System.out.println("Key not found.");
                    break;

                case 3:
                    System.out.print("Enter key to delete: ");
                    key = sc.nextLine();
                    if (map.remove(key) != null)
                        System.out.println("Deleted.");
                    else
                        System.out.println("Key not found.");
                    break;

                case 4:
                    System.out.println("HashMap contents: " + map);
                    break;

                case 0:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}

}
