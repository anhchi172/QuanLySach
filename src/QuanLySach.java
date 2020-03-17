import java.util.*;
public class QuanLySach {
    // Loi: HashSet theo e hieu se ko co duplicate, nhung khi test dien 2 ma tai lieu giong nhau he thong ko tra ve loi
    private HashSet<TaiLieu> hs;

    public QuanLySach() {
        hs = new HashSet<TaiLieu>();
   }

    public void add(TaiLieu l) {
        hs.add(l);
   }

    // Loi: code chay, nhung khi goi method hien thi tai lieu da xoa van con
    public void xoaTaiLieu(int m) {
        for (int i = 0; i < hs.size(); i++) {
            if (hs.contains(m)) {
                hs.remove(i);
         }
      }
      System.out.println("Da xoa tai lieu voi ma: "+ m);
   }

    public void hienThiTaiLieu() {

        for (TaiLieu i : hs) {

            System.out.print("\nMa tai lieu: " + i.getMaTaiLieu() +
                       "\nNha xuat ban: " + i.getNhaXuatBan()+ 
                       "\nBan Phat Hanh: " +  i.getBanPhatHanh());
     /*Loi khi chay doan code duoi vi method getTenTacGia cua class Sach, nhung Java ko cho multi class inheritance. Em chua nghi ra cach de hien thi cac thuoc tinh cua moi the loai subclass
                    
    System.out.println("***" + i.getClass().getName());
    if (i.getClass().getName().equals("Sach")){
   System.out.println("\nTac gia" + i.getTacGia() + "\nSo Trang: " + i.getSoTrang());
   }
   
   else if (i.getClass().getName().equals("Bao")){
   System.out.println("\nNgay Phat Hanh: " + i.getNgayPhatHanh());
   }
   else {
     System.out.println("\nSo Phat Hanh: " + i.getSoPhatHanh() + "\nThang Phat Hanh: " + i.getThangPhatHanh());
      }*/

   }

}
// Error: Return memory address/hashcode instead of String
//Vi du: input sach. Tra ve: Sach@6cd8737
public void timTheoLoai(String type) {
    hs.stream()
         .filter(x -> x.getClass().getName().equals(type))
         .forEach(System.out::println);
   
   }



   public static void exit(){
      System.out.println("Exit");
      return;
   
   }
}

