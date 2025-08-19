/*import java.util.Scanner;

public class BrowserHistoryScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = -1;
        History current = null;

        while(key != 3){
            System.out.println();
            key = sc.nextInt();


            switch(key) {
                case 1:
                //ask 
                String url = sc.nextLine();
                History fresh = new History(url);

                if (current == null) {
                    current = fresh;
                    first = fresh
                } else {
                    current.next = fresh;
                    current = fresh;
                    
                }
                break;

                case 2:
                History curItem = first;
                while (item != null){
                    System.out.println("URL: " +curItem());

                }
                break;
                case 3:

            }
        }

    }
}
*/