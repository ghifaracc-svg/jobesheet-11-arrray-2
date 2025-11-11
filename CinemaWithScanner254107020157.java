import java.util.Scanner;

public class CinemaWithScanner254107020157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare variables
        int row, column, menu;
        String name, next;

        // Create 2D array for audience
        String[][] audience = new String[4][2];

        // Main program loop
        while (true) {
            // Display menu
            System.out.println("\n=== MINI CINEMA MENU ===");
            System.out.println("1. Add Audience");
            System.out.println("2. View Audience List");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            if (menu == 1) {
                // MENU 1: Add audience
                while (true) {
                    System.out.print("Enter audience name: ");
                    name = sc.nextLine();

                    // Repeat until valid & empty seat chosen
                    while (true) {
                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();
                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt();
                        sc.nextLine(); // consume leftover newline

                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println("❌ Invalid seat! Please choose a valid row (1–4) and column (1–2).");
                            continue;
                        }

                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("⚠️ Seat already occupied by "
                                    + audience[row - 1][column - 1]
                                    + ". Please choose another seat.");
                        } else {
                            // Assign name to seat
                            audience[row - 1][column - 1] = name;
                            System.out.println("✅ Seat successfully assigned to " + name + ".");
                            break; // seat accepted
                        }
                    }

                    System.out.print("Add another audience? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (menu == 2) {
                // MENU 2: Display audience list
                System.out.println("\n=== Audience List ===");
                System.out.println("(*** means seat is empty)");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (audience[i][j] != null) {
                            System.out.print(audience[i][j] + "\t");
                        } else {
                            System.out.print("***\t"); // replaced [Empty] with ***
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                // Exit
                System.out.println("Exiting program... 👋");
                break;

            } else {
                System.out.println("❌ Invalid menu option. Please choose 1–3.");
            }
        }

        sc.close();
    }
}
