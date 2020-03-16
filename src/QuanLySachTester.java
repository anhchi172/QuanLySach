import java.util.*;
public class QuanLySachTester{

   public static void main (String [] args) {
      Scanner scan = new Scanner(System.in);
   
      HashSet<QuanLySach> set = new HashSet<>();
      int act;
      do{
         System.out.println("Chon thao tac can thuc hien:\n1. Them moi\n2. Xoa\n3. Hien thi\n4. Tim kiem\n5. Thoat");
      act = checkInput(1,5);
         if (act ==1){
            System.out.println("Chon \n1.Sach\n2.Tap chi\n3.Bao");
            int choice = checkInput(1,3);
            if (choice == 1)
            { 
               Sach sach = new Sach(nhapMa(), nhapTen(), nhapSo(), nhapTacGia(), nhapSoTrang());
               set.add(sach);
               System.out.println("Da them sach vao kho du lieu");
               
            }
            
            else if (choice == 2){
               TapChi tapchi = new TapChi(nhapMa(), nhapTen(), nhapSo(), nhapSoPhatHanh(), nhapThangPhatHanh());
               set.add(tapchi);
               System.out.println("Da them tap chi vao kho du lieu");
            }
            
            else {
               Bao bao = new Bao(nhapMa(), nhapTen(), nhapSo(), nhapNgayPhatHanh());
               set.add(bao);
               System.out.println("Da them bao vao kho du lieu");
            }
         }
         
         else if (act == 2){
            int ma = nhapMa();
            QuanLySach.xoaTaiLieu(set, ma);
         }
         
         else if (act == 3){
            QuanLySach.hienThiTaiLieu(set);
         }
         
         else if (act == 4){
            System.out.print("Nhap loai can tim (vd: Sach, TapChi, Bao): ");
            String type = scan.next();
            QuanLySach.timTheoLoai(set, type);
         }
   
      
      }while (act!=5);
   
      QuanLySach.exit();
   }
   
   public static int nhapMa(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap ma tai lieu: ");
      int ma = scan.nextInt();
      return ma;
   }
   public static String nhapTen(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap ten nha xuat ban: ");
      String ten = scan.nextLine();
      return ten;
   }

   public static int nhapSo(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap so ban phat hanh: ");
      int so = scan.nextInt();
      return so;
   }
   public static String nhapTacGia(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap tac gia: ");
      String tacGia = scan.nextLine();
      return tacGia;
   }

   public static int nhapSoTrang(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap so trang: ");
      int trang = scan.nextInt();
      return trang;
   }
   public static int nhapSoPhatHanh(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap so phat hanh: ");
      int so = scan.nextInt();
      return so;
   }

   public static int nhapThangPhatHanh(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap thang phat hanh: ");
      int thang = scan.nextInt();
      return thang;
   }
   public static int nhapNgayPhatHanh(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap ngay phat hanh: ");
      int ngay = scan.nextInt();
      return ngay;
   }

   private static int checkInput(int a, int b){
      Scanner scan = new Scanner (System.in);
      int choice = scan.nextInt();
   
      while (choice<a || choice>b){
         System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
         choice = scan.nextInt();
      }
   
      return choice;
   }

}