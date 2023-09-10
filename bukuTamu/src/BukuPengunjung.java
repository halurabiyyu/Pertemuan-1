package bukuTamu.src;
import java.util.ArrayList;
import java.util.List;

public class BukuPengunjung {
    private List<Pengunjung> pengunjungList = new ArrayList<>();

    public BukuPengunjung() {
    }

    public BukuPengunjung(List<Pengunjung> pengunjungList) {
        this.pengunjungList = pengunjungList;
    }

    public List<Pengunjung> getPengunjungList() {
        return pengunjungList;
    }

    public void setPengunjungList(List<Pengunjung> PengunjungList) {
        this.pengunjungList = PengunjungList;
    }

    public void addPengunjung(Pengunjung Pengunjung){
        this.pengunjungList.add(Pengunjung);
    }

    public void printPengunjung(){
        for (Pengunjung Pengunjung:pengunjungList){
            System.out.println(Pengunjung.getNama());
            System.out.println(Pengunjung.getAlamat());
            System.out.println(Pengunjung.getNoHP());
        }
    }
}