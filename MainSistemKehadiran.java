import java.util.*;
public class MainSistemKehadiran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataMahasiswa listMhs = new DataMahasiswa(5);
        DataAbsensi listAbsensi = new DataAbsensi(10);
        DataMataKuliah listMK = new DataMataKuliah(3);

        // dummy
        listMhs.tambah(new Mahasiswa("Ali Rahman","22001"));
        listMhs.tambah(new Mahasiswa("Budi Santoso","22002"));
        listMhs.tambah(new Mahasiswa("Citra Dewi","22003"));
        listMhs.tambah(new Mahasiswa("Deni Saputra","22004"));
        listMhs.tambah(new Mahasiswa("Eka Wulandari","22005"));

        while (true) {
            System.out.println();
            System.out.println("=== SISTEM PENGELOLAAN KEHADIRAN MAHASISWA ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Absensi");
            System.out.println("4. Urutkan Data Absensi Berdasarkan Persentase Kehadiran");
            System.out.println("5. Cari Data Absensi Berdasarkan NIM ");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                listMhs.tampil();

            } else if (menu == 2) {
                listMK.tampil();

            } else if (menu == 3) {
                listAbsensi.tampil();

            } else if (menu == 4) {
                // method sorting % absensi

            } else if (menu == 5) {
                // method search nim
                
            } else if (menu == 0) {
                System.out.println("Keluar dari program");
                break;
            } else {
                System.out.println("Input tidak valid, silakan input ulang");
                continue;
            }
        }
    }
}
