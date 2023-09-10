public class tasSekolah extends tas {
    private String tipeModel;
    private int uk_kompartmenLaptop;
    private boolean tmptBotol;
    
    public void setTipeModel(String tipeModel) {
        this.tipeModel = tipeModel;
    }
    public void setKompartmenLaptop(int uk_kompartmenLaptop) {
        this.uk_kompartmenLaptop = uk_kompartmenLaptop;
    }
    public void setTmptBotol(boolean tmptBotol) {
        this.tmptBotol = tmptBotol;
    }

    public void printData(){
        super.printData();
        System.out.println("Tipe Model : "+tipeModel);;
        System.out.println("Kompartmen Laptop :"+uk_kompartmenLaptop);;
        System.out.println("Tempat Botol : "+tmptBotol);;
    }
}
