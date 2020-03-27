import java.util.*;

public class Bao extends TaiLieu {
   private int ngayPhatHanh;
   public Bao(int ma, String ten, int so,int n){
      super(ma, ten, so);
      ngayPhatHanh = n;
   }
   
   public int getNgayPhatHanh(){
       return ngayPhatHanh;
   }

    @Override
    public String toString() {
        return ("\nThe loai: Bao" +
                " Ma tai lieu: " + getMaTaiLieu() +
                " Nha xuat ban: " + getNhaXuatBan() +
                " Ban Phat Hanh: " + getBanPhatHanh() +
                " Ngay Phat Hanh: " + getNgayPhatHanh());
      }

}
