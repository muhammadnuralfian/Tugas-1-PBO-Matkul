package umkm.laundry;

public abstract class Karyawan {
    private String nama;
    private String nip;
    private String alamat;

    public Karyawan(String nama, String nip, String alamat) {
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    // Method abstrak untuk menghitung gaji (akan di-override di subclass)
    public abstract double hitungGaji();
}
