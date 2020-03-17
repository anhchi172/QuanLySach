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
   /*public static void hienThiTaiLieu(){
      for(TaiLi i: al){
         System.out.print("The loai: Tap chi\nMa tai lieu: " + i.getMaTaiLieu() +"\nNha xuat ban: " + i.getNhaXuatBan()+ "\nBan Phat Hanh: " +  i.getBanPhatHanh()+ "\nSo Phat Hanh: " + soPhatHanh + "\nThang Phat Hanh: " + thangPhatHanh);
      }
   
   }*/



}
