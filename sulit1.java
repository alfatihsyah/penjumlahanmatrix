import java.util.Scanner;

public class sulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah baris");
        int baris = input.nextInt();
        System.out.println("masukkan jumlah kolom");
        int kolom = input.nextInt();

        int[][] matriksa = new int[baris][kolom];
        int[][] matriksb = new int[baris][kolom];
        int[][] hasilmatriks = new int[baris][kolom];

        System.out.println("masukkan matriks A ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("bilangan matriks a[" + i + "][" + j + "]: ");
                matriksa[i][j] = input.nextInt();
            }
        }
        System.out.println("masukkan matrik B");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("bilangan matriks b[" + i + "][" + j + "]: ");
                matriksb[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasilmatriks[i][j] = matriksa[i][j] + matriksb[i][j];
            }
        }
        System.out.println("hasil matriks");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasilmatriks[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}