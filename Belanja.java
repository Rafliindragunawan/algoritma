import java.util.Scanner;
public class Belanja {
    
    public static void main(String[] args) throws Exception {
        Double totalBelanja, discount;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan total belanaja: ");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja >= 1000000) {
            discount = (double) 5/100 * totalBelanja;
            totalBelanja = totalBelanja - discount;
        }

        System.out.println("Total yang haru dibayar: " + totalBelanja);
        inputan.close();
    }
}
    