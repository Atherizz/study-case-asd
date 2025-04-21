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
        for (int i = 1; i <= listAbsensi.length-1; i++) {
            Absensi temp = listAbsensi[i];
            int j = i-1;
            while (j >= 0 && listAbsensi[j].hitungPersentaseKehadiran() < temp.hitungPersentaseKehadiran()) {
                listAbsensi[j+1] = listAbsensi[j];
                j--;
            }
            listAbsensi[j+1] = temp;
        }
    }

    int LinearSearch(String Carinim) {
        int posisi = -1;

        for (int i = 0; i < idx; i++){
            if (listAbsensi[i].mahasiswa.nim.equals(Carinim)){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void TampilPosisi(String nim, int pos){
        if (pos == -1){
            System.out.println("Data Absensi dengan NIM "+nim+" tidak ditemukan.");
        }else{
            System.out.println("Data Absensi dengan NIM "+nim+" ditemukan pada index ke - " + pos);
        }
    }

    void TampilSearch(String nim, int pos){
        if (pos != -1){
            System.out.println("==== DATA ABSENSI MAHASISWA ====");

            listAbsensi[pos].tampilData();
        }
    }
}
