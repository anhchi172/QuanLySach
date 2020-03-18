import java.util.Objects;

public class TaiLieu {
    private int maTaiLieu;
    private String nhaXuatBan;
    private int banPhatHanh;

    public TaiLieu(int m, String n, int b) {
        maTaiLieu = m;
        nhaXuatBan = n;
        banPhatHanh = b;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public int getBanPhatHanh() {
        return banPhatHanh;
    }

    public void setMaTaiLieu(int m) {
        maTaiLieu = m;
    }

    public void setNhaXuatBan(String n) {
        nhaXuatBan = n;
    }

    public void setBanPhatHanh(int b) {
        banPhatHanh = b;
    }

    @Override
    public boolean equals(Object obj) {

        TaiLieu tl = (TaiLieu) obj;
        if (tl != null) {
            return tl.getMaTaiLieu() == maTaiLieu;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTaiLieu);
    }
}