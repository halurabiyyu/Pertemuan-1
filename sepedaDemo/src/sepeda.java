package sepedaDemo.src;

public class sepeda {
    private String merek;
    private int kecepatan, gear;
    private int ge;
    
    public void setMerek(String newValue){
        merek = newValue;
    };

    public void gantiGear(int newValue){
        gear = newValue;
    }
    
    public void tambahKecepatan(int increment){
        kecepatan= kecepatan+increment;
    }

    public void rem(int decrement){
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus(){
        System.out.println("Merek: "+merek);
        System.out.println("Kecepatan : "+kecepatan);
        System.out.println("Gear: "+gear);
    }
}