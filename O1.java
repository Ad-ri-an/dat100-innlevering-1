package O1;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("skriv inn din bruttoinntekt: ");
        double inntekt = sc.nextDouble();

        if (inntekt > 217400) {
            if (306051 <= inntekt && inntekt <= 697150) {
                double trinnSkatt = (inntekt * 4.0) / 100.0;
                System.out.println("Du må betale " + trinnSkatt + " i trinnskatt.");

            }
            else if (697151 <= inntekt && inntekt <= 942400) {
                double trinnSkatt = (inntekt * 13.7) / 100.0;
                System.out.println("Du må betale " + trinnSkatt + " i trinnskatt.");
            }
            else if (942401 <= inntekt && inntekt <= 1410750) {
                double trinnSkatt = (inntekt * 16.7) / 100.0;
                System.out.println("Du må betale " + trinnSkatt + " i trinnskatt.");
                
            }
            else if (1410751 <= inntekt) {
                double trinnSkatt = (inntekt * 17.7) / 100.0;
                System.out.println("Du må betale " + trinnSkatt + " i trinnskatt,");
            }
            else {
                double trinnSkatt = (inntekt * 1.7) / 100.0;
                System.out.println("Du må betale " + trinnSkatt + " i trinnskatt.");
            }
        }
        else {
            System.out.println("Heldige deg, du slipper å betale trinnskatt!");
        }
    }
}
