import java.util.*;
public class Sach extends QuanLySach {
   private String tacGia;
   private int soTrang;
   public Sach (int ma, String ten, int so, String t, int s){
      super(ma, ten, so);
      tacGia = t;
      soTrang = s;
   }

public void setTacGia(String t){
tacGia = t;
}

public void setSoTrang(int s){
soTrang = s;
}

public String getTacGia(){
return tacGia;
}
public int getSoTrang(){
return soTrang;
}
public static void hienThiTaiLieu(HashSet<Sach> al){
for(Sach i: al){
   
   System.out.print("The loai: Sach\nMa tai lieu: " + i.getMaTaiLieu() +"\nNha xuat ban: " + i.getNhaXuatBan()+ "\nBan Phat Hanh: " +  i.getBanPhatHanh()+ "\nTac gia" + i.getTacGia() + "\nSo Trang: " + i.getSoTrang());
   }

}
}