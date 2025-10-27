package umkm.laundry;

public class Main {
    public static void main(String[] args) {
        ManajemenGaji manajemen = new ManajemenGaji();

        // Tambahkan data karyawan
        KaryawanKontrak kontrak1 = new KaryawanKontrak("Siti Rahma", "L001", "Bandung", 3500000, 500000);
        KaryawanParuhWaktu paruh1 = new KaryawanParuhWaktu("Budi Santoso", "L002", "Cimahi", 120, 25000);
        KaryawanParuhWaktu paruh2 = new KaryawanParuhWaktu("Rina Wati", "L003", "Bandung Barat", 90, 20000);

        manajemen.tambahKaryawan(kontrak1);
        manajemen.tambahKaryawan(paruh1);
        manajemen.tambahKaryawan(paruh2);

        // Tampilkan hasil gaji semua karyawan
        manajemen.tampilkanGajiKaryawan();
    }
}
