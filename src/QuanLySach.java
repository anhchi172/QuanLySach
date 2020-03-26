import java.util.*;
public class QuanLySach {
    // Loi: HashSet theo e hieu se ko co duplicate, nhung khi test dien 2 ma tai lieu giong nhau he thong ko tra ve loi
    private ArrayList<TaiLieu> hs;
    private TaiLieuDao taiLieuDao;

    public QuanLySach() {
        taiLieuDao = new TaiLieuDao();
        hs = (ArrayList<TaiLieu>) taiLieuDao.read();
   }

    public void add(TaiLieu l) {
        hs.add(l);
        taiLieuDao.write((List<TaiLieu>) hs);
   }

    // Loi: code chay, nhung khi goi method hien thi tai lieu da xoa van con
    public void xoaTaiLieu(int m) {

        TaiLieu tl = hs.stream().filter(TaiLieu -> TaiLieu.getMaTaiLieu() == m).findFirst().orElse(null);
        if (tl != null) {
            hs.remove(tl);
            taiLieuDao.write((List<TaiLieu>) hs);
            System.out.println("Da xoa tai lieu voi ma: " + m);
        } else {
            System.out.println("Ko tim duoc tai lieu voi ma da nhap");
        }


   }

    public void hienThiTaiLieu() {

        for (TaiLieu i : hs) {

            System.out.print(i.toString());
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

    Object[] arr = hs.stream()
            .filter(x -> x.getClass().getName().equalsIgnoreCase(type.replace(" ", ""))).toArray();
    if (arr.length > 0) {
        for (Object i : arr) {
            System.out.println(i.toString());
        }
    } else {

        System.out.println("Ko tim thay tai lieu thuoc type: " + type);
    }

}







   public static void exit(){
      System.out.println("Exit");
      return;
   
   }
}

