import java.util.Scanner;

class PhanSo {
    private long tu, mau;

    public PhanSo() {
        tu = mau = 0;
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long UCLN(long a, long b) {
        while(a * b != 0) {
            if(a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }

    public void rutgon() {
        long ucln = UCLN(tu, mau);
        tu /= ucln;
        mau /= ucln;
    }

    public PhanSo cong(PhanSo other) {
        PhanSo kq = new PhanSo();

        kq.tu = this.tu * other.mau + this.mau * other.tu;
        kq.mau = this.mau * other.mau;

        kq.rutgon();
        return kq;
    }

    public PhanSo nhan(PhanSo other) {
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * other.tu;
        kq.mau = this.mau * other.mau;
        kq.rutgon();
        return kq;
    }
    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class J04014_TINH_TOAN_PHAN_SO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            PhanSo a = new PhanSo(in.nextInt(), in.nextInt());
            a.rutgon();
            PhanSo b = new PhanSo(in.nextInt(), in.nextInt());
            b.rutgon();

            PhanSo cong = a.cong(b);
            PhanSo c = cong.nhan(cong);
            System.out.print(c + " ");

            PhanSo d = a.nhan(b).nhan(c);
            System.out.println(d);
        }
        in.close();
    }
}