import java.math.BigInteger;
import java.util.Scanner;

class PhanSo {
    private BigInteger tuSo;
    private BigInteger mauSo;
    public PhanSo(BigInteger tuSo, BigInteger mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public BigInteger getTuSo() {
        return tuSo;
    }
    public BigInteger getMauSo() {
        return mauSo;
    }
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
class tongPS {
    private BigInteger x1;
    private BigInteger y1;
    private BigInteger x2;
    private BigInteger y2;
    public tongPS(BigInteger x1, BigInteger y1, BigInteger x2, BigInteger y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public PhanSo tinhToan() {
        // Tính tử số và mẫu số của phân số tổng
        BigInteger tuso = x1.multiply(y2).add(x2.multiply(y1));
        BigInteger mauso = y1.multiply(y2);
        // Rút gọn phân số
        BigInteger gcd = tuso.gcd(mauso);
        tuso = tuso.divide(gcd);
        mauso = mauso.divide(gcd);
        return new PhanSo(tuso, mauso);
    }
}
public class J04004_TONG_PHAN_SO {
    public static void main(String[] args) {
        // Khởi tạo các phân số
        Scanner in = new Scanner(System.in);
        BigInteger x1 = in.nextBigInteger();
        BigInteger y1 = in.nextBigInteger();
        BigInteger x2 = in.nextBigInteger();
        BigInteger y2 = in.nextBigInteger();
        // Tạo đối tượng tongPS
        tongPS s = new tongPS(x1, y1, x2, y2);
        // Hiển thị kết quả
        System.out.println(s.tinhToan());
        in.close();
    }
}
