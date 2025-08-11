public class Main {
    public static void main(String[] args) {

        String[] vehicleType = {"SUV", "COUPE", "SEDAN", "VAN"};
        int[][] vehicleSales = {
                {25, 15, 35},
                {25, 55, 35},
                {11, 20, 45},
                {17, 27, 25}
        };

        System.out.println("******************************************");
        System.out.println("           Vehicle Sales Report           ");
        System.out.println("******************************************");

        System.out.printf("%22s%11s%11s\n", "JAN", "FEB", "MAR");

        for (int i = 0; i < vehicleType.length; i++) {
            System.out.printf("%-10s%12d%12d%12d\n",
                    vehicleType[i],
                    vehicleSales[i][0],
                    vehicleSales[i][1],
                    vehicleSales[i][2]
            );
        }

        System.out.println("******************************************");
        System.out.println("           VEHICLE TOTAL SALES            ");
        System.out.println("******************************************");

        int sum;

        for (int i = 0; i < vehicleType.length; i++) {
            sum = 0;
            System.out.print(vehicleType[i] + ": ");

            for (int j = 0; j < 3; j++) {
                sum += vehicleSales[i][j];
            }

            if (sum < 100) {
                System.out.println(sum + " (Silver)");
            } else if (sum >= 100) {
                System.out.println(sum + " (Gold)");
            }
        }
    }
}
