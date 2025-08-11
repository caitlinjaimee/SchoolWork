import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size=3;
        String[] ITEMS ={"pencil","rubber","paintbrush"};
        String foundit;
        String item;
        String price="";
        int[]PRICES={3,5,10};
        int sub=0;

        System.out.println("enter item to search for(pencil: , rubber: , paintbrush:) ");
        item =scanner.nextLine();

        foundit="N";
        while(sub<size) {
            if (item.equals(ITEMS[sub])) {
                foundit="Y";
                price = String.valueOf((PRICES[sub]));
            }
            sub++;
        }
        if (foundit.equals("Y"))

        {
            System.out.println("the price is:" +price);
        }
        else
        {
            System.out.println("item not found");
        }
    }
}