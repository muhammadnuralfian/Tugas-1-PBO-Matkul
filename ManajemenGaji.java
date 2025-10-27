package umkm.laundry;

import java.util.ArrayList;
import java.util.List;

public class ManajemenGaji {
    private List<Karyawan> daftarKaryawan = new ArrayList<>();

    public void tambahKaryawan(Karyawan k) {
        daftarKaryawan.add(k);
    }

    public void tampilkanGajiKaryawan() {
        System.out.println("===== DATA GAJI CLEAN&FRESH LAUNDRY =====");
        for (Karyawan k : daftarKaryawan) {
            System.out.println("Nama           : " + k.getNama());
            System.out.println("NIP            : " + k.getNip());
            System.out.println("Alamat         : " + k.getAlamat());
            System.out.println("Jenis Karyawan : " + k.getClass().getSimpleName());
            System.out.println("Total Gaji     : Rp " + k.hitungGaji());
            System.out.println("-----------------------------------------");
        }
    }
}
