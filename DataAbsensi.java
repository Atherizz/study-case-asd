public class DataAbsensi {
    int idx;
    Absensi listAbsensi[];

    DataAbsensi (int jmlAbsensi) {
        listAbsensi = new Absensi[jmlAbsensi];
        idx = 0;
    }

    void tambah(Absensi a) {
        if (idx < listAbsensi.length) {
            listAbsensi[idx] = a;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Absensi a : this.listAbsensi) {
            a.tampilData();
            System.out.println("--------------------------");
        }
    }

    void SortPersentaseDesc() {
        
    }
}
