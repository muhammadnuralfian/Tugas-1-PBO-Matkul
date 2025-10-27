package umkm.laundry;

public class KaryawanKontrak extends Karyawan {
    private double gajiPokok;
    private double bonusPelanggan;

    public KaryawanKontrak(String nama, String nip, String alamat, double gajiPokok, double bonusPelanggan) {
        super(nama, nip, alamat);
        this.gajiPokok = gajiPokok;
        this.bonusPelanggan = bonusPelanggan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + bonusPelanggan;
    }
}
