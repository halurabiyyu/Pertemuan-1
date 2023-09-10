public class kasur {
    int panjang, lebar;
    int tebal;
    String warna;
    int luas;

    kasur(){

    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public void setTebal(int tebal) {
        this.tebal = tebal;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public int hitungLuas(int panjang, int lebar){
        return luas = panjang*lebar;
    }
    public void printData(){
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);;
        System.out.println("Tebar : "+tebal);
        System.out.println("Luas : "+ luas);;
    }
}
