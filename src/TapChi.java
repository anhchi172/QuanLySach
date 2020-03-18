import java.util.*;

public class TapChi extends TaiLieu {
   private int soPhatHanh;
   private int thangPhatHanh;
   public TapChi(int ma, String ten, int so, int s, int t){
      super(ma, ten, so);
      soPhatHanh = s;
      thangPhatHanh = t;
   }

   public int getSoPhatHanh() {
      return soPhatHanh;
   }

   public int getThangPhatHanh() {
      return thangPhatHanh;
   }

   @Override
   public String toString() {
      return ("\nThe loai: Tap chi" +
              " Ma tai lieu: " + getMaTaiLieu() +
              " Nha xuat ban: " + getNhaXuatBan() +
              " Ban Phat Hanh: " + getBanPhatHanh() +
              " So Phat Hanh: " + getSoPhatHanh() +
              " Thang Phat Hanh: " + getThangPhatHanh());
   }
   /*public static void hienThiTaiLieu(){
      for(TaiLi i: al){

      }
   
   }*/



}
