public class Absensi {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir,sakit,izin,alpa;

    Absensi (Mahasiswa mahasiswa, MataKuliah mataKuliah, int hadir,int sakit, int izin, int alpa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.hadir = hadir;
        this.sakit = sakit;
        this.izin = izin;
        this.alpa = alpa;
    }

    void tampilData() {
        System.out.println("NIM : " + this.mahasiswa.nim + " |  Nama : " + this.mahasiswa.name);
        System.out.println("Mata Kuliah " + this.mataKuliah.nama);
        System.out.println("hadir : " + this.hadir + " | sakit : " + this.sakit + " | izin : " + this.izin + " | alpa : " + this.alpa);
        System.out.println("Persentase Kehadiran : " + String.format("%.2f", hitungPersentaseKehadiran()) + "%");
    }

    double hitungPersentaseKehadiran() {
        double total = this.hadir + this.alpa + this.izin + this.sakit;
        return (this.hadir / total) * 100;
    }



}
