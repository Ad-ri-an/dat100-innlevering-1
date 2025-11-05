package O2;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 10; i++){

            int p;
            while (true){
                System.out.println("Skriv inn poengsum: ");
                p = sc.nextInt();
                if (0 <= p && p <= 100) {
                    break;
                }
                else {
                    System.out.println("Ugyldig nummer!");
                }
            }


            if (0 <= p && p <= 39) {
                    System.out.println("Du fikk en F");
            }
            else if (40 <= p && p <= 49) {
                    System.out.println("Du fikk en E");
            }
            else if (50 <= p && p <= 59) {
                    System.out.println("Du fikk en D");
            }
            else if (60 <= p && p <= 79) {
                    System.out.println("Du fikk en C");
            }
            else if (80 <= p && p <= 89) {
                    System.out.println("Du fikk en B");
            }
            else if (90 <= p && p <= 100) {
                    System.out.println("Du fikk en A");
            }
            System.out.println();
        }
        sc.close();
    }
}
