public class Main {
    public static void main(String[] args) {

        int[][] numbers = {{8, 2, 5}, {5, 5, 3}, {7, 7, 2}, {8, 9, 10}, {7, 4, 3}, {7, 8, 9}};
        int[][] totals = {{15}, {16}, {12}, {7}, {23}, {20}};
        String[] rooms = {"Bathroom", "Kitchen", "Garden"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

        System.out.println();
        for (String room : rooms) {
            System.out.print(room + "\t");
        }
        System.out.println();


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(months[i] + "\t");

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }

            System.out.println();
        }
        System.out.println("Monthly totals");
        for (int k = 0; k < totals.length; k++) {
            System.out.print(months[k] + "\t");

            for (int p = 0; p < totals[k].length; p++) {
                System.out.print(totals[k][p] + "\t");
                if (totals.length>=15){

                }
            }

            System.out.println();

        }



    }
}
