public class Cinema254107020157 {
    public static void main(String[] args) {

        // Step 3: Create a 2D array for audience (4 rows, 2 columns)
        String[][] audience = new String[4][2];

        // Step 4: Initialize array elements (name of mini cinema audience)
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        // Step 5: Display total rows and length of each row using foreach
        System.out.println("Total rows: " + audience.length);

        int rowNumber = 0;
        for (String[] row : audience) {
            System.out.println("Length of row " + rowNumber + ": " + row.length);
            rowNumber++;
        }

        // Step 6: Display the audience names in the 3rd row (index 2)
        System.out.println("\nAudiences in row 3:");
        for (int i = 0; i < audience[2].length; i++) {
            System.out.println(audience[2][i]);
        }
    }
}
