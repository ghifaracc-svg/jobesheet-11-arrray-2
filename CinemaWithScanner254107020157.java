import java.util.Scanner;

public class CinemaWithScanner254107020157 { // replace 123456 with your student ID
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Step 4: Declare Scanner

        // Step 5: Declare variables
        int row, column;
        String name, next;

        // Step 6: Create 2D array for audience
        String[][] audience = new String[4][2];

        // Step 7: Input data
        while (true) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();

            System.out.print("Enter row number (1-4): ");
            row = sc.nextInt();

            System.out.print("Enter column number (1-2): ");
            column = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            // Store data in array
            audience[row - 1][column - 1] = name;

            System.out.print("Are there any other audiences to be added? (y/n): ");
            next = sc.nextLine();

            // ✅ Corrected comparison
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Display the stored data
        System.out.println("\n=== Audience List ===");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (audience[i][j] != null) {
                    System.out.print(audience[i][j] + "\t");
                } else {
                    System.out.print("[Empty]\t");
                }
            }
        }

        sc.close();
    }
}
