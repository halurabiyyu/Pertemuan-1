public class tas {
    private String merk;
    private int harga;
    private String warna;
    private int pjgTali;

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String getMerk() {
        return merk;
    }
    public int getHarga() {
        return harga;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setPjgTali(int pjgTali) {
        this.pjgTali = pjgTali;
    }
    public int getPjgTali() {
        return pjgTali;
    }
    
    public int tambah_pjgTali(int increment){
        return pjgTali = pjgTali + increment;
    }
    public int kurang_pjgTali(int decrement){
        return pjgTali = pjgTali - decrement;
    }
    public void printData(){
        System.out.println("Merk : "+merk);
        System.out.println("Harga :" +harga);;
        System.out.println("Warna : "+warna);;
        System.out.println("Panjang Tali : "+ pjgTali);
    }
}
