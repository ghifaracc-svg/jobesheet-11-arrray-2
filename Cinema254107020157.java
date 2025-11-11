public class Cinema254107020157 { // Step 2: Class name same as file name
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

        // Step 5: Display all array contents
        System.out.println(audience.length);
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + i + ": " + audience[i].length);
        }
    }
}