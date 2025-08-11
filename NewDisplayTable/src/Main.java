public class Main {
    public static void main(String[] args) {

        int[][] NumberOfRooms = {{8, 2, 5}, {5, 5, 3}, {7, 7, 2}, {8, 9, 10}, {7, 4, 3}, {7, 8, 9}};
        int[][] Totals = {{15}, {16}, {12}, {7}, {23}, {20}};
        String[] Rooms = {"Bathroom", "Kitchen", "Garden"};
        String[] Months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

        System.out.println("**************");
        System.out.println("Makeover Report");
        System.out.println("**************");

        System.out.printf("%-10s","");
        for (String room : Rooms) {
            System.out.printf(room + "\t");
        }
        System.out.println();


        for (int i = 0; i < NumberOfRooms.length; i++) {
            System.out.printf("%-10s",Months[i] + "\t");

            for (int j = 0; j < NumberOfRooms[i].length; j++) {
                System.out.printf("%-10s",NumberOfRooms[i][j] + "\t");
            }

            System.out.println();
        }
        System.out.println("**************");
        System.out.println("Monthly totals");
        System.out.println("**************");


        for (int i = 0; i < Totals.length; i++) {
            int monthly = 0;
            for (int j = 0; j < Totals[i].length; j++) {
                monthly += Totals[i][j];
            }
            System.out.printf("%-10s%-10d", Months[i], monthly);
            if (monthly >= 15) {
                System.out.printf("%-10s", "***");
            }
            System.out.println();

        }
    }
}
