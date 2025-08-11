
public class Main {
    public static void main(String[] args) {

        int[][] ListOfNumbers = {{20, 50, 10}, {80, 25, 15}, {60, 100, 35}, {40, 75, 45}};


        for (int i = 0; i < ListOfNumbers.length; i++) {

            for (int j = 0; j < ListOfNumbers[i].length; j++) {
                System.out.print(ListOfNumbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}