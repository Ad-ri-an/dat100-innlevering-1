package O3;
import java.util.Scanner;

public class O3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn et heltall (n > 0):");
        int n = sc.nextInt();

        int fakultet = 1;
        for (int i = 1; i <= n; i++){
            fakultet *= i;
        }
        System.out.println(n + "! = " + fakultet);
        sc.close();
    }

}
