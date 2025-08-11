
public class Main {
    public static void main(String[] args) {


        String[] Months = {"jan", "feb", "march", "april", "may", "june"};
        int[][] NumberOfRooms = {
                {8, 2, 5},
                {5, 5, 3},
                {7, 7, 2},
                {8, 9, 10},
                {7, 4, 3},
                {7, 8, 9}};
        String[] Rooms = {"bathroom", "kitchen", "garden"};
        int[][] Totals =
                {{15},
                {16},
                {12},
                        {7},
                        {23},
                        {20}};



        System.out.println();
        for (String room : Rooms) {
            System.out.print(room + "\t");
        }



        for (int i = 0; i < NumberOfRooms.length; i++) {
            for (int j = 0; j < NumberOfRooms[i].length; j++) {

                System.out.print(Months[i] + "\t");
                System.out.print(NumberOfRooms[i][j] + "\t");
            }

            System.out.println();
        }



        System.out.println("Totals");
        int k;
        for (k = 0; k < Totals.length; k++) {
            System.out.print(Months[k] + "\t");
        }

        for (int c = 0; c < Totals[k].length; c++) {
            System.out.print(Totals[k][c]);
            if (Totals.length<=15);
        }
        System.out.println();

    }
}