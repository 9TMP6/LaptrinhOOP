package buoi3;

class Nhanvien {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private float luong;

    public Nhanvien() {
        ten = "";
        ngaySinh = "";
        gioiTinh = "";
        luong = 0f;
    }

    public void nhapTen(String ten) {
        this.ten = ten;
    };

    public void nhapNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    };

    public void nhapGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    };

    public void nhapLuong(float luong) {
        this.luong = luong;
    };

    public String xemTen() {
        return this.ten;
    };

    public String xemNgaySinh() {
        return this.ngaySinh;
    };

    public String xemGioiTinh() {
        return this.gioiTinh;
    };

    public float xemLuong() {
        return this.luong;
    };

}

public class Bai2 {
    public static void main(String[] args) {
    }
}
