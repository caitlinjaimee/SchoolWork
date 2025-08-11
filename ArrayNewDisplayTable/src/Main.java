public class Main {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "March", "April", "May", "June"};
        int[][] numberOfRooms = {
                {8, 2, 5},
                {5, 5, 3},
                {7, 7, 2},
                {8, 9, 10},
                {7, 4, 3},
                {7, 8, 9}
        };
        String[] rooms = {"Bathroom", "Kitchen", "Garden"};

        System.out.println("**************");
        System.out.println("Makeover Report");
        System.out.println("**************");

        // Print room headers
        System.out.printf("%-10s", "Month");
        for (String room : rooms) {
            System.out.printf("%-10s", room);
        }
        System.out.println();

        // Print each month's room data
        for (int i = 0; i < numberOfRooms.length; i++) {
            System.out.printf("%-10s", months[i]);  // print month

            for (int j = 0; j < numberOfRooms[i].length; j++) {
                System.out.printf("%-10s", numberOfRooms[i][j]);  // print room scores
            }
            System.out.println();
        }

        // Calculate and display totals
        System.out.println("\n**************");
        System.out.println("Monthly Totals");
        System.out.println("**************");

        for (int i = 0; i < numberOfRooms.length; i++) {
            int total = 0;
            for (int j = 0; j < numberOfRooms[i].length; j++) {
                total += numberOfRooms[i][j];
            }

            System.out.printf("%-10s%-10d", months[i], total);

            if (total >= 15) {
                System.out.print("***");
            }
            System.out.println();
        }
    }
}
