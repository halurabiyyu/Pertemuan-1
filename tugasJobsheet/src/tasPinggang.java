public class tasPinggang extends tas {
    private String tipeBahan;
    private String tipeTali;
    private int jmlKompartmen;

    public void setTipeBahan(String tipeBahan) {
        this.tipeBahan = tipeBahan;
    }
    public void setTipeTali(String tipeTali) {
        this.tipeTali = tipeTali;
    }

    public void printData(){
        super.printData();
        System.out.println("Tipe Bahan : "+ tipeBahan);
        System.out.println("Tipe Tali : "+tipeTali);
    }
}
