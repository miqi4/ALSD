public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.NIM = "22001";
        mhs.nama = "Ali Rahman";
        mhs.prodi = "Informatika";

        mhs.tampilMahasiswa();

        Mahasiswa mhs2 = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        mhs2.tampilMahasiswa();
        Mahasiswa mhs3 = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");
        mhs3.tampilMahasiswa();

    }
}
