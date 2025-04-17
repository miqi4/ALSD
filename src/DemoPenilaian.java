import java.util.Scanner;
public class DemoPenilaian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };
        MataKuliah[] daftarMataKuliah = {
            new MataKuliah("MK001", "Struktur Data" , 3),
            new MataKuliah("MK002", "Basis Data" , 3),
            new MataKuliah("MK003", "Desain Web" , 3),
        };
        
        int menu,nim;

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
                for (Mahasiswa m : daftarMahasiswa) {
                    m.tampilMahasiswa();
                }
            }else if (menu == 2) {
                for (MataKuliah m : daftarMataKuliah) {
                    m.tampilMatakuliah();
                }         
            }
                else if (menu == 3) {
                    Penilaian[] mhs = {
                        new Penilaian(daftarMahasiswa[0],daftarMataKuliah[0], 80, 85, 90), 
                        new Penilaian(daftarMahasiswa[0],daftarMataKuliah[1], 60, 75, 70), 
                        new Penilaian(daftarMahasiswa[1],daftarMataKuliah[0], 75, 70, 80), 
                        new Penilaian(daftarMahasiswa[2],daftarMataKuliah[1], 85, 90, 95), 
                        new Penilaian(daftarMahasiswa[2],daftarMataKuliah[2], 80, 90, 65), 
                    };
                
                    System.out.println("\nData Penilaian:");
                    for (Penilaian p : mhs) {
                        p.tampilDataPenilaian();
                    }
                }
                
                
            // }if (menu == 4) {
                
            // }else if (menu == 5) {
            //     System.out.print("masukkan nim mahasiswa yang dicari : ");
            //     nim = sc.nextInt();
            // }

        } }
        }
        
    