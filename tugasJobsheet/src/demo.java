public class demo {
    public static void main(String[] args) {
        lemari lmr1 =new lemari();
        kasur ksr1 = new kasur();
        tas tas1 = new tas();
        tasPinggang tas2 = new tasPinggang();
        tasSekolah tas3 = new tasSekolah();


        System.out.println("====LEMARI====");
        lmr1.setPanjangLmr(80);
        lmr1.setLebarLmr(20);
        lmr1.setTinggiLmr(70);;
        lmr1.setPintu(2);;
        lmr1.setWarna("coklat");;
        lmr1.hitungVolume();
        lmr1.printData();
        System.out.println("=============");

        System.out.println("===KASUR===");
        ksr1.setPanjang(200);
        ksr1.setLebar(50);;
        ksr1.setTebal(10);
        ksr1.setWarna("Biru");
        ksr1.hitungLuas(ksr1.panjang, ksr1.lebar);
        ksr1.printData();;
        System.out.println("=============");


        System.out.println("====TAS====");
        tas1.setMerk("POLO");
        tas1.setHarga(200000);
        tas1.setPjgTali(30);;
        tas1.setWarna("Hitam");;
        tas1.printData();;
        System.out.println("=============");
        
        System.out.println("===TAS PINGGGANG===");
        tas2.setMerk("EIGER");
        tas2.setHarga(150000);
        tas2.setPjgTali(30);;
        tas2.setWarna("Coklat");;
        tas2.setTipeBahan("Anti Air");;
        tas2.setTipeTali("Kain");;
        tas2.printData();
        System.out.println("=============");


        System.out.println("===TAS SEKOLAH===");
        tas3.setMerk("NIKE");
        tas3.setHarga(300000);
        tas3.setPjgTali(30);;
        tas3.setWarna("Merah");;
        tas3.setTipeModel("Classic");
        tas3.setKompartmenLaptop(15);
        tas3.setTmptBotol(true);;
        tas3.printData();
        System.out.println("=============");
    }
}
