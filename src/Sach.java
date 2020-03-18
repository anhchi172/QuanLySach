import java.util.*;

public class Sach extends TaiLieu {
   private String tacGia;
   private int soTrang;
   public Sach (int ma, String ten, int so, String t, int s){
      super(ma, ten, so);
      tacGia = t;
      soTrang = s;
   }

    public void setTacGia(String t) {
        tacGia = t;
    }

    public void setSoTrang(int s) {
        soTrang = s;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    @Override
    public String toString() {
        return ("\nThe loai: Sach Ma tai lieu: " + getMaTaiLieu() +
                " Nha xuat ban: " + getNhaXuatBan() +
                " Ban Phat Hanh: " + getBanPhatHanh() +
                " Tac gia" + getTacGia() +
                " So Trang: " + getSoTrang());
    }
/*   @Overide
public void hienThiTaiLieu(){

   for(Sach i: hs){
   
   System.out.print
   }
   


}*/
}