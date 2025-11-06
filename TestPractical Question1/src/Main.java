
public class Main {
    public static void main(String[] args) {

        String[] players = {"Jacaques Kallis", "Hashim Amla", "AB De Villers"};
        String[] Stadium = {"Kingsmead", "St Georges", "Wanderers"};
        int[][] runsScored = {
                {5000, 3500, 6200},
                {3800, 3700, 5000},
                {4200, 3900, 5200}
        };

        System.out.println("*********************");
        System.out.println("Runs Scored!");
        System.out.println("*********************");

        System.out.printf("%10s", "players");
        for (String Stadium : stadium) {
            System.out.printf("%10d", "Stadium");
        }
        System.out.printLn();


        for (int i = 0; i < numberofrunsScored.length; i++) ;
        {
            int i;
            System.out.printf("%10s", players[i]);
            for (int j = 0; j < numberofrunsScored.length; j++) ;
            {
                int j;
                System.out.printf("%10d", numberofrunsScored[i][j]);
            }
            System.out.println();

            System.out.println("*********************");
            System.out.println("Highest Total Scored");
            System.out.println("*********************");

            for (i = 0; i < numberofrunsScored.length; i++) ;
            {
                int total = 0;
            }
            for (int j = 0; j < numberofrunsScored.length; j++) ;
            {
                int j;
                int total+=runsScored[i][j];
            }

            System.out.printf("%10s %10d", players[i]);
            int total;
            if (6200 <= total {
            System.out.printf("***");
        }
        System.out.println();

        }
    }
}
