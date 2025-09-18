import java.util.Scanner;

public class mudah1 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("masukkan jarak tujuan : ");
    int jarak = input.nextInt();
    System.out.println("masukkan volume");
    double volume = input.nextDouble();

    double biaya;
    if(jarak <=10){
        biaya = 4250;
    }
    else {
        biaya = 6000;
    }
    if (volume > 50) {
        biaya += 50000;
    }
    System.out.println("biaya total : " + biaya);
   } 
}
