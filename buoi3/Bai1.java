package buoi3;

class Xe {
    private String soXe;
    private String chuXe;
    private String hieuXe;
    private float gia;
    private int dungTich;

    public Xe() {
        soXe = "";
        chuXe = "";
        hieuXe = "";
        gia = 0f;
        dungTich = 0;

    }

    public float tinhThue() {
        if (this.dungTich < 100)
            return this.gia * 0.01f;
        if (this.dungTich > 200)
            return this.gia * 0.05f;
        return this.gia * 0.03f;
    }
}

public class Bai1 {
    public static void main(String[] args) {
    }
}
