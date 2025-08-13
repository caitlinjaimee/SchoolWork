
public class Main {
    public static void main(String[] args) {

        String[] Months = {"Jan", "Feb", "Feb"};
        String[][] SpeedingFines = {

                {"128km", "135km", "135km"},
                {"155km", "129km", "175km"},
                {"129km", "130km", "185km"},
                {"195km", "155km",   "221"}
        };

        String[] Cities = {"JHB", "DNB", "CTN", "PE"};


        System.out.println("***********************");
        System.out.println("Monthly Speeding Fines");
        System.out.println("*********************");

        System.out.printf("%-10s", "Months");
        for (String months : Months) ;
        System.out.printf("%-10s", "Cities");
        {
            System.out.println();
        }
        int i;
        for (i = 0; i < SpeedingFines.length; i++) ;
        System.out.printf("%10s", Months[i]);
        int j;
        for(j = 0; j < SpeedingFines.length; j++);
        System.out.printf("%10s", Cities[j]);

        System.out.println("***********************");
        System.out.println("Speeding Fines Statistics");
        System.out.println("*********************");


         }



}