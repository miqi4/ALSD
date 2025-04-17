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
        Penilaian[] nilaiAkhir = {
            new Penilaian(daftarMahasiswa[0],daftarMataKuliah[0], 80, 85, 90), 
            new Penilaian(daftarMahasiswa[0],daftarMataKuliah[1], 60, 75, 70), 
            new Penilaian(daftarMahasiswa[1],daftarMataKuliah[0], 75, 70, 80), 
            new Penilaian(daftarMahasiswa[2],daftarMataKuliah[1], 85, 90, 95), 
            new Penilaian(daftarMahasiswa[2],daftarMataKuliah[2], 80, 90, 65), 
        };
        String menu;
        String input;

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
            menu = sc.nextLine();
            if (menu.equals("1")) {
                for (Mahasiswa m : daftarMahasiswa) {
                    m.tampilMahasiswa();
                }
            }else if (menu.equals("2")) {
                for (MataKuliah m : daftarMataKuliah) {
                    m.tampilMatakuliah();
                }         
            }
            else if (menu.equals("3")) {
                    System.out.println("\nData Penilaian:");
                    for (int i = 0; i < nilaiAkhir.length; i++) {
                    nilaiAkhir[i].tampilDataPenilaian();
                }
            }
            else if (menu.equals("4")) {
                for (int i = 0; i < nilaiAkhir.length; i++) {
                    for (int j = 1; j < nilaiAkhir.length; j++) {
                        if (nilaiAkhir[j].hitungNilaiAkhir() > nilaiAkhir[j-1].hitungNilaiAkhir()) {
                            Penilaian temp = nilaiAkhir[j];
                            nilaiAkhir[j] = nilaiAkhir[j-1];
                            nilaiAkhir[j-1] = temp;
                        }
                    }
                }
                for (Penilaian nilai : nilaiAkhir) {
                    System.out.println(nilai.mahasiswa.nama + "  |  " + nilai.mataKuliah.NamaMK + "  |  " + "Nilai Akhir : " + nilai.hitungNilaiAkhir() );
                }

            } else if (menu.equals("5")) {
                System.out.print("masukkan nim mahasiswa yang dicari : ");
                input = sc.nextLine();
                boolean isFound = false;
                for (int i = 0; i < daftarMahasiswa.length; i++) {
                    if (input.equals(daftarMahasiswa[i].NIM)) {
                        System.out.println("mahasiswa ditemukan");
                        System.out.println("Nama "+daftarMahasiswa[i].nama+" NIM "+daftarMahasiswa[i].NIM+" Prodi "
                        +daftarMahasiswa[i].prodi);
                        isFound = true;
                    }
                }
                if (!isFound) System.out.println("Tidak ditemukan");
                isFound = false;
            } else if (menu.equals("0")) {
                System.out.println("Selesai");
                break;
            } else {
                System.out.println("===========================");
                System.out.println("Input tidak sesuai, ulangi!");
                System.out.println("===========================");
            }
    }
}
}     
    