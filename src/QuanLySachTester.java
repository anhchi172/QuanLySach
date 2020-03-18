import java.util.*;
public class QuanLySachTester{

   public static void main (String [] args) {
      Scanner scan = new Scanner(System.in);
       QuanLySach hs = new QuanLySach();
       //HashSet<QuanLySach> set = new HashSet<>();
      int act;
      do{
         System.out.println("\nChon thao tac can thuc hien:\n1. Them moi\n2. Xoa\n3. Hien thi\n4. Tim kiem\n5. Thoat");
      act = checkInput(1,5);
         if (act ==1){
            System.out.println("Chon \n1.Sach\n2.Tap chi\n3.Bao");
            int choice = checkInput(1,3);
            if (choice == 1)
            {
                TaiLieu sach = new Sach(nhapMa(), nhapTen(), nhapSo(), nhapTacGia(), nhapSoTrang());
                hs.add(sach);
               System.out.println("Da them sach vao kho du lieu");
               
            }

            else if (choice == 2){
                TaiLieu tapchi = new TapChi(nhapMa(), nhapTen(), nhapSo(), nhapSoPhatHanh(), nhapThangPhatHanh());
                hs.add(tapchi);
               System.out.println("Da them tap chi vao kho du lieu");
            }
            
            else {
                TaiLieu bao = new Bao(nhapMa(), nhapTen(), nhapSo(), nhapNgayPhatHanh());
                hs.add(bao);
               System.out.println("Da them bao vao kho du lieu");
            }
         }
         
         else if (act == 2){
            int ma = nhapMa();
             hs.xoaTaiLieu(ma);
         }
         
         else if (act == 3){
             hs.hienThiTaiLieu();
         }
         
         else if (act == 4){
            System.out.print("Nhap loai can tim (vd: Sach, TapChi, Bao): ");
            String type = scan.next();
             hs.timTheoLoai(type);
         }
   
      
      }while (act!=5);
       hs.exit();
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
       int so = checkInput(1, Integer.MAX_VALUE);
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
       int trang = checkInput(1, Integer.MAX_VALUE);
      return trang;
   }
   public static int nhapSoPhatHanh(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap so phat hanh: ");
       int so = checkInput(1, Integer.MAX_VALUE);
      return so;
   }

   public static int nhapThangPhatHanh(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap thang phat hanh: ");
       int thang = checkInput(1, 12);
      return thang;
   }
   public static int nhapNgayPhatHanh(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Nhap ngay phat hanh: ");
       int ngay = checkInput(1, 31);
      return ngay;
   }

   private static int checkInput(int a, int b){
      Scanner scan = new Scanner (System.in);
      try {
         int choice = scan.nextInt();

         while (choice < a || choice > b) {
            System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
            choice = scan.nextInt();
         }


         return choice;
      } catch (Exception e) {
         System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
         return checkInput(a, b);
      }
   }

}