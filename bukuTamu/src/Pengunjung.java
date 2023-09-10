package bukuTamu.src;

public class Pengunjung {
    private String nama,alamat,noHP;

    public Pengunjung() {
    }

    public Pengunjung(String nama, String alamat, String noHP) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
     public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNoHP() {
        return noHP;
    }
}