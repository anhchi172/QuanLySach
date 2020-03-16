import java.util.*;
public class QuanLySach {
   private int maTaiLieu;
   private String nhaXuatBan;
   private int banPhatHanh;
   public QuanLySach(int m, String n, int b){
      maTaiLieu = m;
      nhaXuatBan = n; 
      banPhatHanh = b;
   }

   public int getMaTaiLieu(){
      return maTaiLieu;
   }
   public String getNhaXuatBan(){
      return nhaXuatBan;
   }
   public int getBanPhatHanh(){
      return banPhatHanh;
   }
   public void setMaTaiLieu(int m){
      maTaiLieu = m;
   }
   public void setNhaXuatBan(String n){
      nhaXuatBan = n;
   }

   public void setBanPhatHanh (int b){
      banPhatHanh = b;
   }



   public static void xoaTaiLieu(HashSet<QuanLySach> al, int m){
      for (int i = 0; i< al.size(); i++){
         if (al.contains(m)){
            al.remove(i);
         }
      }
      System.out.println("Da xoa tai lieu voi ma: "+ m);
   }

   public static void hienThiTaiLieu(HashSet<QuanLySach> al){
   //Iterator<QuanLySach> i = al.iterator();
   for(QuanLySach i: al){
   
   System.out.println("\nMa tai lieu: " + i.getMaTaiLieu() +
                       "\nNha xuat ban: " + i.getNhaXuatBan()+ 
                       "\nBan Phat Hanh: " +  i.getBanPhatHanh());
   }

}
// Error: Return memory address/hashcode instead of String
   public static void timTheoLoai(HashSet<QuanLySach> al, String type){
      al.stream()
         .filter(x -> x.getClass().getName().equals(type))
         .forEach(System.out::println);
   
   }



   public static void exit(){
      System.out.println("Exit");
      return;
   
   }
}
