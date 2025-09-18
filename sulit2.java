import java.util.Scanner;

public class sulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("masukkan jumlah siswa");
        int siswa = input.nextInt();
        int [] nilaisiswa = new int [siswa];
        for (int i = 0; i < siswa; i++) {
            System.out.println("masukkan nilai siswa " +  (i + 1)+ ":");
            nilaisiswa[1] = input.nextInt();
        }
        double totalNilai = 0;
        for (int i = 0; i < siswa; i++) {
            totalNilai += nilaisiswa[i];
        }
        double rataRata = totalNilai / siswa;
        System.out.println("rata rata : " + rataRata);
    }
}
