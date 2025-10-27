package umkm.laundry;

public class KaryawanParuhWaktu extends Karyawan {
    private int jamKerja;
    private double tarifPerJam;

    public KaryawanParuhWaktu(String nama, String nip, String alamat, int jamKerja, double tarifPerJam) {
        super(nama, nip, alamat);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamKerja * tarifPerJam;
    }
}
