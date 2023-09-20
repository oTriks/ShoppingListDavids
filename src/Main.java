import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int MAX_SIZE = 3;   //för att inte gömma siffran inne i koden

        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println("Skapa en matlista:");
        String newItem = "";

        while (!newItem.equals("done")) {
            // Skriv ut "mata in"
            System.out.println("Lägg till:");
            // läs in
            newItem = sc.nextLine();
            // "&&" för att slå ihop 2 if satser
            // if (!newItem.equals("done") && shoppingList.size() < MAX_SIZE) {
            // shoppingList.add(newItem);
            if (!newItem.equals("done")) {
                if (shoppingList.size() < MAX_SIZE) {
                    shoppingList.add(newItem);


                    // lägg i lista  (men inte i loopen)
                } else {

                }
            }
        }
    }

    // printList(shoppingList);



    public static void checkAndReplaceItem(ArrayList<String> shoppingList, String newItem) {
        boolean replaced = false;
        while (!replaced) {
            System.out.println("Vilken vara ska ersättas?");
            printList(shoppingList);
            String itemToRemove = sc.nextLine();
            // gör en ny funktion för att inte skapa pyramid
            // replace item to remove with "newItem" inuti shoppingList
            replaced = replace(itemToRemove, newItem, shoppingList);
        }
    }

    public static boolean replace(String oldItem, String newItem, ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldItem)) {
                list.set(i, newItem);
                return true;
            }
        }
        return false;
    }

    public static void printList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}


// vad är void?  funktionen gör något, men returnerar inget