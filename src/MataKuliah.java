public class MataKuliah {
    String KodeMK, NamaMK;
    int sks;

    public MataKuliah() {
    }    
    public MataKuliah(String KodeMK, String NamaMK, int sks) {
        this.KodeMK = KodeMK;
        this.NamaMK = NamaMK;
        this.sks = sks;
    }
    void tampilMatakuliah(){
        System.out.println("Kode MK: " + KodeMK + "  |  Nama: " + NamaMK + "  |  SKS: " + sks);
    }
}