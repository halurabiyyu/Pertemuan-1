/**
 * tugas
 */
public class lemari {
    int pintu, panjangLmr;
    int lebarLmr, tinggiLmr;
    String warna;
    int volume;
    
    lemari(){

    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setPintu(int pintu) {
        this.pintu = pintu;
    }
    public void setPanjangLmr(int panjangLmr) {
        this.panjangLmr = panjangLmr;
    }
    public void setLebarLmr(int lebarLmr) {
        this.lebarLmr = lebarLmr;
    }
    public void setTinggiLmr(int tinggiLmr) {
        this.tinggiLmr = tinggiLmr;
    }
    public void gantiUkuran(int newPanjang, int newLebar, int newTinggi){
        panjangLmr = newPanjang;
        lebarLmr = newLebar;
        tinggiLmr = newTinggi;
    }
    public int hitungVolume(){        
        return volume = panjangLmr*lebarLmr*tinggiLmr;
    }
    public void printData(){
        System.out.println("Jumlah Pintu : "+ pintu);
        System.out.println("Panjang Lemari : "+ panjangLmr);
        System.out.println("Lebar Lemari : "+ lebarLmr);
        System.out.println("Tinggi Lemari : "+ tinggiLmr);
        System.out.println("Volume Lemari : "+ volume);
    }
   
}
