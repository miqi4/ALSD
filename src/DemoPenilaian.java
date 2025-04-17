
import java.util.Scanner;

public class DemoPenilaian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        String[][] penonton = new String[4][2];
        Mahasiswa mhs = new Mahasiswa();
        mhs.NIM = "22001";
        mhs.nama = "Ali Rahman";
        mhs.prodi = "Informatika";

        while (true) {
            System.out.println();
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasisaw Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {

                Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Informatika");
                mhs2.tampilMahasiswa();
                Mahasiswa mhs3 = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");
                mhs3.tampilMahasiswa();
                Mahasiswa mhss = new Mahasiswa();
                mhs.tampilMahasiswa();

            } else if (menu == 2) {
                for (String[] row : penonton) {
                    for (String elemen : row) {
                        System.out.print((elemen != null ? elemen : "***") + " ");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            } else  {
                System.out.println("Data yang anda masukkan salah");
            }
        }

    }
}
