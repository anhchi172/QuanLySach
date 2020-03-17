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
   
   /*public static void hienThiTaiLieu(HashSet<QuanLySach> al){
      for(TaiLieu i: al){
      
         System.out.print("The loai: Bao\nMa tai lieu: " + i.getMaTaiLieu() +
                    "\nNha xuat ban: " + i.getNhaXuatBan()+ 
                    "\nBan Phat Hanh: " +  i.getBanPhatHanh()+ 
                    "\nNgay Phat Hanh: " + i.getNgayPhatHanh);
      }
   
   }*/
}